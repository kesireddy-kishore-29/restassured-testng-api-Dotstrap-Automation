# Transcript: Every conversation operation answers an unknown id with a 404 problem [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[0]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-14571b9f-facd-4a35-8f4e-d349c242e8a9` |
| 2 | `POST /v1/auth/token` | 200 | 18 | `qa-5c697838-0070-49e6-bc2a-13d87160e9f5` |
| 3 | `GET /v1/conversations/{id}` | 404 | 8 | `qa-4cfdcbed-222a-465e-abe2-691a6e260729` |
| 4 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-bdc2f7ac-7615-403e-8d8c-8897d8a0ae18` |
| 5 | `POST /v1/auth/token` | 401 | 13 | `qa-83fa5731-e7eb-4b3f-aa39-4f9a39164ba2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-14571b9f-facd-4a35-8f4e-d349c242e8a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14571b9f-facd-4a35-8f4e-d349c242e8a9
Content-Type: application/json

--- request body ---
{"handle":"qa-de7da752c5ef","displayName":"QA de7da752c5ef","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-14571b9f-facd-4a35-8f4e-d349c242e8a9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 288
RateLimit-Reset: 7
Location: /v1/accounts/qa-de7da752c5ef
X-Served-Region: eu
Content-Length: 181

{"id":"acc_14c4360a-f4d8-4615-9c20-5d988a1e8a58","handle":"qa-de7da752c5ef","displayName":"QA de7da752c5ef","region":"eu","role":"user","createdAt":"2026-11-17T10:50:20.306280523Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-5c697838-0070-49e6-bc2a-13d87160e9f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c697838-0070-49e6-bc2a-13d87160e9f5
Content-Type: application/json

--- request body ---
{"handle":"qa-de7da752c5ef","password":"****"}

--- response: 200 in 18 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c697838-0070-49e6-bc2a-13d87160e9f5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 281
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_14c4360a-f4d8-4615-9c20-5d988a1e8a58"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-4cfdcbed-222a-465e-abe2-691a6e260729

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cfdcbed-222a-465e-abe2-691a6e260729
Content-Type: application/json

--- response: 404 in 8 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4cfdcbed-222a-465e-abe2-691a6e260729
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 253

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-4cfdcbed-222a-465e-abe2-691a6e260729"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bdc2f7ac-7615-403e-8d8c-8897d8a0ae18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bdc2f7ac-7615-403e-8d8c-8897d8a0ae18
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bdc2f7ac-7615-403e-8d8c-8897d8a0ae18
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-83fa5731-e7eb-4b3f-aa39-4f9a39164ba2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83fa5731-e7eb-4b3f-aa39-4f9a39164ba2
Content-Type: application/json

--- request body ---
{"handle":"qa-de7da752c5ef","password":"****"}

--- response: 401 in 13 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-83fa5731-e7eb-4b3f-aa39-4f9a39164ba2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 274
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-83fa5731-e7eb-4b3f-aa39-4f9a39164ba2"}
```
