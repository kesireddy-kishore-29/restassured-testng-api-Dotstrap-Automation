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
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-2fd88a5e-c4f3-4d60-8afa-5c9acb824a7d` |
| 2 | `POST /v1/auth/token` | 200 | 23 | `qa-d35a2f94-9456-406e-82c5-48151c83f420` |
| 3 | `GET /v1/conversations/{id}` | 404 | 6 | `qa-a423780c-ef49-4017-be45-4f857f2b5bc2` |
| 4 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-7181e23d-5244-4800-9abb-a28911b942aa` |
| 5 | `POST /v1/auth/token` | 401 | 5 | `qa-060f9555-87d4-45fc-b270-237a0a791716` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2fd88a5e-c4f3-4d60-8afa-5c9acb824a7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fd88a5e-c4f3-4d60-8afa-5c9acb824a7d
Content-Type: application/json

--- request body ---
{"handle":"qa-073851a7873f","displayName":"QA 073851a7873f","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-2fd88a5e-c4f3-4d60-8afa-5c9acb824a7d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 290
RateLimit-Reset: 7
Location: /v1/accounts/qa-073851a7873f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ea31640a-1918-4265-b991-05ae3a8be508","handle":"qa-073851a7873f","displayName":"QA 073851a7873f","region":"eu","role":"user","createdAt":"2026-11-18T10:19:53.269012832Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-d35a2f94-9456-406e-82c5-48151c83f420

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d35a2f94-9456-406e-82c5-48151c83f420
Content-Type: application/json

--- request body ---
{"handle":"qa-073851a7873f","password":"****"}

--- response: 200 in 23 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-d35a2f94-9456-406e-82c5-48151c83f420
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 284
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ea31640a-1918-4265-b991-05ae3a8be508"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-a423780c-ef49-4017-be45-4f857f2b5bc2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a423780c-ef49-4017-be45-4f857f2b5bc2
Content-Type: application/json

--- response: 404 in 6 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a423780c-ef49-4017-be45-4f857f2b5bc2
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-a423780c-ef49-4017-be45-4f857f2b5bc2"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7181e23d-5244-4800-9abb-a28911b942aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7181e23d-5244-4800-9abb-a28911b942aa
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7181e23d-5244-4800-9abb-a28911b942aa
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
correlation: qa-060f9555-87d4-45fc-b270-237a0a791716

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-060f9555-87d4-45fc-b270-237a0a791716
Content-Type: application/json

--- request body ---
{"handle":"qa-073851a7873f","password":"****"}

--- response: 401 in 5 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-060f9555-87d4-45fc-b270-237a0a791716
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 277
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-060f9555-87d4-45fc-b270-237a0a791716"}
```
