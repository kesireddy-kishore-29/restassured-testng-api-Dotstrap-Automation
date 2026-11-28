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
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-a5b2e3db-dcba-49fd-b547-33580c6fd86a` |
| 2 | `POST /v1/auth/token` | 200 | 15 | `qa-3a879fec-2c9c-4bb1-a430-d21e4febacab` |
| 3 | `GET /v1/conversations/{id}` | 404 | 12 | `qa-38682395-9331-4676-9251-2b23c7dfd75d` |
| 4 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-ac3baf51-a66d-4771-a2ea-88c1eb49ac58` |
| 5 | `POST /v1/auth/token` | 401 | 12 | `qa-7f098961-b819-4d04-96cd-a7611322d0a5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a5b2e3db-dcba-49fd-b547-33580c6fd86a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5b2e3db-dcba-49fd-b547-33580c6fd86a
Content-Type: application/json

--- request body ---
{"handle":"qa-3aa5ec09e7fb","displayName":"QA 3aa5ec09e7fb","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-a5b2e3db-dcba-49fd-b547-33580c6fd86a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 293
RateLimit-Reset: 7
Location: /v1/accounts/qa-3aa5ec09e7fb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c71372c5-2a5f-496f-b4c2-16d670cbd0a2","handle":"qa-3aa5ec09e7fb","displayName":"QA 3aa5ec09e7fb","region":"eu","role":"user","createdAt":"2026-11-23T10:55:00.426589553Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-3a879fec-2c9c-4bb1-a430-d21e4febacab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a879fec-2c9c-4bb1-a430-d21e4febacab
Content-Type: application/json

--- request body ---
{"handle":"qa-3aa5ec09e7fb","password":"****"}

--- response: 200 in 15 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a879fec-2c9c-4bb1-a430-d21e4febacab
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c71372c5-2a5f-496f-b4c2-16d670cbd0a2"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-38682395-9331-4676-9251-2b23c7dfd75d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38682395-9331-4676-9251-2b23c7dfd75d
Content-Type: application/json

--- response: 404 in 12 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-38682395-9331-4676-9251-2b23c7dfd75d
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-38682395-9331-4676-9251-2b23c7dfd75d"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ac3baf51-a66d-4771-a2ea-88c1eb49ac58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac3baf51-a66d-4771-a2ea-88c1eb49ac58
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ac3baf51-a66d-4771-a2ea-88c1eb49ac58
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
correlation: qa-7f098961-b819-4d04-96cd-a7611322d0a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f098961-b819-4d04-96cd-a7611322d0a5
Content-Type: application/json

--- request body ---
{"handle":"qa-3aa5ec09e7fb","password":"****"}

--- response: 401 in 12 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7f098961-b819-4d04-96cd-a7611322d0a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 280
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7f098961-b819-4d04-96cd-a7611322d0a5"}
```
