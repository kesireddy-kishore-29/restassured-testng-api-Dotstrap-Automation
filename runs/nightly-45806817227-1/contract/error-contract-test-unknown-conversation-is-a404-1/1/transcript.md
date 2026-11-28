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
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-34f024da-99b7-4723-8e5c-72417c23f59c` |
| 2 | `POST /v1/auth/token` | 200 | 15 | `qa-cfa330ea-dd90-4f61-b94d-0340c4b9b41e` |
| 3 | `GET /v1/conversations/{id}/messages` | 404 | 13 | `qa-5d7b36b8-1adf-4383-ae72-27a4043acc67` |
| 4 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-620f5c70-06e1-4bd0-94f6-71ffa6d32eea` |
| 5 | `POST /v1/auth/token` | 401 | 15 | `qa-8aca34aa-38dd-4118-87c5-d8bbbabafbd8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-34f024da-99b7-4723-8e5c-72417c23f59c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34f024da-99b7-4723-8e5c-72417c23f59c
Content-Type: application/json

--- request body ---
{"handle":"qa-5eadad8c0f7d","displayName":"QA 5eadad8c0f7d","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-34f024da-99b7-4723-8e5c-72417c23f59c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 286
RateLimit-Reset: 6
Location: /v1/accounts/qa-5eadad8c0f7d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_de9c06ff-6b29-4481-8ab1-2373b47a9549","handle":"qa-5eadad8c0f7d","displayName":"QA 5eadad8c0f7d","region":"eu","role":"user","createdAt":"2026-11-26T11:02:47.321267195Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-cfa330ea-dd90-4f61-b94d-0340c4b9b41e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfa330ea-dd90-4f61-b94d-0340c4b9b41e
Content-Type: application/json

--- request body ---
{"handle":"qa-5eadad8c0f7d","password":"****"}

--- response: 200 in 15 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-cfa330ea-dd90-4f61-b94d-0340c4b9b41e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 282
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_de9c06ff-6b29-4481-8ab1-2373b47a9549"}
```

## 3. GET /v1/conversations/{id}/messages

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-5d7b36b8-1adf-4383-ae72-27a4043acc67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d7b36b8-1adf-4383-ae72-27a4043acc67
Content-Type: application/json

--- response: 404 in 13 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5d7b36b8-1adf-4383-ae72-27a4043acc67
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-5d7b36b8-1adf-4383-ae72-27a4043acc67"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-620f5c70-06e1-4bd0-94f6-71ffa6d32eea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-620f5c70-06e1-4bd0-94f6-71ffa6d32eea
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-620f5c70-06e1-4bd0-94f6-71ffa6d32eea
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
correlation: qa-8aca34aa-38dd-4118-87c5-d8bbbabafbd8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8aca34aa-38dd-4118-87c5-d8bbbabafbd8
Content-Type: application/json

--- request body ---
{"handle":"qa-5eadad8c0f7d","password":"****"}

--- response: 401 in 15 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8aca34aa-38dd-4118-87c5-d8bbbabafbd8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 277
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8aca34aa-38dd-4118-87c5-d8bbbabafbd8"}
```
