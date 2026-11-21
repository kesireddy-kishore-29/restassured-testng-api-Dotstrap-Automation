# Transcript: Every conversation operation answers an unknown id with a 404 problem [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-f50dbf03-c24f-4136-b220-3882971add77` |
| 2 | `POST /v1/auth/token` | 200 | 14 | `qa-709006ce-df86-434a-a1a6-9b78baf5bca5` |
| 3 | `GET /v1/conversations/{id}/messages` | 404 | 17 | `qa-a4d7c4bd-27b0-41b0-b5ef-6a466aaf61c7` |
| 4 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-8dcf7e77-9fea-45c2-bb51-69bd234a303e` |
| 5 | `POST /v1/auth/token` | 401 | 15 | `qa-1168451a-12a1-4cf9-a277-5ecb6a716b97` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f50dbf03-c24f-4136-b220-3882971add77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f50dbf03-c24f-4136-b220-3882971add77
Content-Type: application/json

--- request body ---
{"handle":"qa-5bd9b4f94ade","displayName":"QA 5bd9b4f94ade","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-f50dbf03-c24f-4136-b220-3882971add77
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 288
RateLimit-Reset: 6
Location: /v1/accounts/qa-5bd9b4f94ade
X-Served-Region: eu
Content-Length: 181

{"id":"acc_24a54f3f-0456-4377-b007-2aeec402e202","handle":"qa-5bd9b4f94ade","displayName":"QA 5bd9b4f94ade","region":"eu","role":"user","createdAt":"2026-11-14T09:05:13.036768699Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-709006ce-df86-434a-a1a6-9b78baf5bca5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-709006ce-df86-434a-a1a6-9b78baf5bca5
Content-Type: application/json

--- request body ---
{"handle":"qa-5bd9b4f94ade","password":"****"}

--- response: 200 in 14 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-709006ce-df86-434a-a1a6-9b78baf5bca5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 284
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_24a54f3f-0456-4377-b007-2aeec402e202"}
```

## 3. GET /v1/conversations/{id}/messages

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-a4d7c4bd-27b0-41b0-b5ef-6a466aaf61c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4d7c4bd-27b0-41b0-b5ef-6a466aaf61c7
Content-Type: application/json

--- response: 404 in 17 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a4d7c4bd-27b0-41b0-b5ef-6a466aaf61c7
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
Content-Length: 262

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-a4d7c4bd-27b0-41b0-b5ef-6a466aaf61c7"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8dcf7e77-9fea-45c2-bb51-69bd234a303e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8dcf7e77-9fea-45c2-bb51-69bd234a303e
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8dcf7e77-9fea-45c2-bb51-69bd234a303e
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
correlation: qa-1168451a-12a1-4cf9-a277-5ecb6a716b97

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1168451a-12a1-4cf9-a277-5ecb6a716b97
Content-Type: application/json

--- request body ---
{"handle":"qa-5bd9b4f94ade","password":"****"}

--- response: 401 in 15 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1168451a-12a1-4cf9-a277-5ecb6a716b97
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 279
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1168451a-12a1-4cf9-a277-5ecb6a716b97"}
```
