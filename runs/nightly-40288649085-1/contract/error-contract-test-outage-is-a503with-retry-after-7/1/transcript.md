# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[7]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-0f4bfd95-59e3-49ee-9299-11d249998153` |
| 2 | `POST /v1/accounts` | 201 | 53 | `qa-fee469e1-5956-4a0a-a31c-d32016ac6153` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-b807b578-323a-40a7-87bd-1fd7b77ab210` |
| 4 | `POST /v1/conversations` | 201 | 36 | `qa-c548103c-5a57-484b-a720-f57827ae956c` |
| 5 | `GET /v1/conversations` | 503 | 22 | `qa-0ca58fe1-0ef3-41bd-89cc-1d1e896e8b3c` |
| 6 | `POST /v1/auth/token` | 200 | 33 | `qa-44807e41-6f72-41b1-97ba-ec57734d3939` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-76679854-e0e3-43f0-b47c-184e9dbc34cc` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-c2225853-af92-4d25-b779-efb16abc6f0c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-1b64b90b-9a74-4b4c-acd0-7eccb40030c3` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-b860381d-33ab-4f89-a4af-5df314447244` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0f4bfd95-59e3-49ee-9299-11d249998153

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f4bfd95-59e3-49ee-9299-11d249998153
Content-Type: application/json

--- request body ---
{"handle":"qa-7a166ddfe740","displayName":"QA 7a166ddfe740","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f4bfd95-59e3-49ee-9299-11d249998153
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 476
RateLimit-Reset: 8
Location: /v1/accounts/qa-7a166ddfe740
X-Served-Region: eu
Content-Length: 181

{"id":"acc_89732756-3182-4a9f-a823-e2fbc5c1fa20","handle":"qa-7a166ddfe740","displayName":"QA 7a166ddfe740","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.518892499Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-fee469e1-5956-4a0a-a31c-d32016ac6153

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fee469e1-5956-4a0a-a31c-d32016ac6153
Content-Type: application/json

--- request body ---
{"handle":"qa-4a39dceb7325","displayName":"QA 4a39dceb7325","password":"****","region":"eu"}

--- response: 201 in 53 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-fee469e1-5956-4a0a-a31c-d32016ac6153
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 467
RateLimit-Reset: 8
Location: /v1/accounts/qa-4a39dceb7325
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6ce0a9ca-b33a-4b5f-868a-8850b5f9aed7","handle":"qa-4a39dceb7325","displayName":"QA 4a39dceb7325","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.595799501Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b807b578-323a-40a7-87bd-1fd7b77ab210

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b807b578-323a-40a7-87bd-1fd7b77ab210
Content-Type: application/json

--- request body ---
{"handle":"qa-7a166ddfe740","password":"****"}

--- response: 200 in 24 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-b807b578-323a-40a7-87bd-1fd7b77ab210
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 454
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_89732756-3182-4a9f-a823-e2fbc5c1fa20"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c548103c-5a57-484b-a720-f57827ae956c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c548103c-5a57-484b-a720-f57827ae956c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4a39dceb7325","subject":"Error contract","message":"Hi"}

--- response: 201 in 36 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-c548103c-5a57-484b-a720-f57827ae956c
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
Location: /v1/conversations/cnv_1b7ef92f-74b4-4ae8-8dde-8c9822112222
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1b7ef92f-74b4-4ae8-8dde-8c9822112222","subject":"Error contract","status":"open","region":"eu","participants":["qa-7a166ddfe740","qa-4a39dceb7325"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:47.697602510Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-0ca58fe1-0ef3-41bd-89cc-1d1e896e8b3c

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: be5111a0-03c1-4c9d-8dba-471b96ac2e7e
X-Correlation-Id: qa-0ca58fe1-0ef3-41bd-89cc-1d1e896e8b3c
Content-Type: application/json

--- response: 503 in 22 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0ca58fe1-0ef3-41bd-89cc-1d1e896e8b3c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-0ca58fe1-0ef3-41bd-89cc-1d1e896e8b3c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-44807e41-6f72-41b1-97ba-ec57734d3939

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44807e41-6f72-41b1-97ba-ec57734d3939
Content-Type: application/json

--- request body ---
{"handle":"qa-4a39dceb7325","password":"****"}

--- response: 200 in 33 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-44807e41-6f72-41b1-97ba-ec57734d3939
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 434
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6ce0a9ca-b33a-4b5f-868a-8850b5f9aed7"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-76679854-e0e3-43f0-b47c-184e9dbc34cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76679854-e0e3-43f0-b47c-184e9dbc34cc
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-76679854-e0e3-43f0-b47c-184e9dbc34cc
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
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-c2225853-af92-4d25-b779-efb16abc6f0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2225853-af92-4d25-b779-efb16abc6f0c
Content-Type: application/json

--- request body ---
{"handle":"qa-4a39dceb7325","password":"****"}

--- response: 401 in 12 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c2225853-af92-4d25-b779-efb16abc6f0c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 425
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c2225853-af92-4d25-b779-efb16abc6f0c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1b64b90b-9a74-4b4c-acd0-7eccb40030c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b64b90b-9a74-4b4c-acd0-7eccb40030c3
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1b64b90b-9a74-4b4c-acd0-7eccb40030c3
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-b860381d-33ab-4f89-a4af-5df314447244

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b860381d-33ab-4f89-a4af-5df314447244
Content-Type: application/json

--- request body ---
{"handle":"qa-7a166ddfe740","password":"****"}

--- response: 401 in 14 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b860381d-33ab-4f89-a4af-5df314447244
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 415
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b860381d-33ab-4f89-a4af-5df314447244"}
```
