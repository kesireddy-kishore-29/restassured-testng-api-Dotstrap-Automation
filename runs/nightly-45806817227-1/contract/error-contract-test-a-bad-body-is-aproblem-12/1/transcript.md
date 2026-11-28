# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[12]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-60ead038-8933-4a04-8f04-c3c02b6cc8d4` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-0f99a2fe-ba4f-4a23-9ce2-b7e1d2e090f4` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-fb25662f-ce72-46c8-80ae-c0fcae786dce` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-9627c8f8-5107-4f8c-b268-95f68d3b2748` |
| 5 | `POST /v1/conversations/{id}/messages` | 400 | 13 | `qa-6598ccc5-0626-4e53-a7f0-4a521abe726f` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-daa463fc-8669-4590-bdce-649cb7ea6458` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-3f45cbe7-ce70-4008-b4d6-b045114c878a` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-cc9101ee-a401-4326-8a8b-3b9ffc12ed43` |
| 9 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-23bc1bcc-25dd-47fc-8b7a-98d58bede624` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-c82cc946-3799-4c7c-bc96-b3b9e94275a3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-60ead038-8933-4a04-8f04-c3c02b6cc8d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60ead038-8933-4a04-8f04-c3c02b6cc8d4
Content-Type: application/json

--- request body ---
{"handle":"qa-11ac5d058a77","displayName":"QA 11ac5d058a77","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-60ead038-8933-4a04-8f04-c3c02b6cc8d4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 369
RateLimit-Reset: 7
Location: /v1/accounts/qa-11ac5d058a77
X-Served-Region: eu
Content-Length: 181

{"id":"acc_920c2d65-8ae3-40c3-880e-ff16ceacb3e0","handle":"qa-11ac5d058a77","displayName":"QA 11ac5d058a77","region":"eu","role":"user","createdAt":"2026-11-26T11:02:46.332194645Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0f99a2fe-ba4f-4a23-9ce2-b7e1d2e090f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f99a2fe-ba4f-4a23-9ce2-b7e1d2e090f4
Content-Type: application/json

--- request body ---
{"handle":"qa-74f8af890139","displayName":"QA 74f8af890139","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f99a2fe-ba4f-4a23-9ce2-b7e1d2e090f4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 364
RateLimit-Reset: 6
Location: /v1/accounts/qa-74f8af890139
X-Served-Region: eu
Content-Length: 181

{"id":"acc_422eefc2-c886-40e0-952f-56b081320cae","handle":"qa-74f8af890139","displayName":"QA 74f8af890139","region":"eu","role":"user","createdAt":"2026-11-26T11:02:46.371876862Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-fb25662f-ce72-46c8-80ae-c0fcae786dce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb25662f-ce72-46c8-80ae-c0fcae786dce
Content-Type: application/json

--- request body ---
{"handle":"qa-11ac5d058a77","password":"****"}

--- response: 200 in 32 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb25662f-ce72-46c8-80ae-c0fcae786dce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 358
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_920c2d65-8ae3-40c3-880e-ff16ceacb3e0"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9627c8f8-5107-4f8c-b268-95f68d3b2748

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9627c8f8-5107-4f8c-b268-95f68d3b2748
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-74f8af890139","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-9627c8f8-5107-4f8c-b268-95f68d3b2748
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
Location: /v1/conversations/cnv_b616659b-c772-4f29-aec3-d803933b16ac
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b616659b-c772-4f29-aec3-d803933b16ac","subject":"Error contract","status":"open","region":"eu","participants":["qa-11ac5d058a77","qa-74f8af890139"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:46.465383802Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_b616659b-c772-4f29-aec3-d803933b16ac/messages
correlation: qa-6598ccc5-0626-4e53-a7f0-4a521abe726f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6598ccc5-0626-4e53-a7f0-4a521abe726f
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 13 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6598ccc5-0626-4e53-a7f0-4a521abe726f
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
Content-Length: 308

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations/cnv_b616659b-c772-4f29-aec3-d803933b16ac/messages","correlationId":"qa-6598ccc5-0626-4e53-a7f0-4a521abe726f"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-daa463fc-8669-4590-bdce-649cb7ea6458

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-daa463fc-8669-4590-bdce-649cb7ea6458
Content-Type: application/json

--- request body ---
{"handle":"qa-74f8af890139","password":"****"}

--- response: 200 in 19 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-daa463fc-8669-4590-bdce-649cb7ea6458
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 338
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_422eefc2-c886-40e0-952f-56b081320cae"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3f45cbe7-ce70-4008-b4d6-b045114c878a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f45cbe7-ce70-4008-b4d6-b045114c878a
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3f45cbe7-ce70-4008-b4d6-b045114c878a
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
correlation: qa-cc9101ee-a401-4326-8a8b-3b9ffc12ed43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc9101ee-a401-4326-8a8b-3b9ffc12ed43
Content-Type: application/json

--- request body ---
{"handle":"qa-74f8af890139","password":"****"}

--- response: 401 in 13 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cc9101ee-a401-4326-8a8b-3b9ffc12ed43
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 336
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cc9101ee-a401-4326-8a8b-3b9ffc12ed43"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-23bc1bcc-25dd-47fc-8b7a-98d58bede624

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23bc1bcc-25dd-47fc-8b7a-98d58bede624
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-23bc1bcc-25dd-47fc-8b7a-98d58bede624
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-c82cc946-3799-4c7c-bc96-b3b9e94275a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c82cc946-3799-4c7c-bc96-b3b9e94275a3
Content-Type: application/json

--- request body ---
{"handle":"qa-11ac5d058a77","password":"****"}

--- response: 401 in 13 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c82cc946-3799-4c7c-bc96-b3b9e94275a3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 335
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c82cc946-3799-4c7c-bc96-b3b9e94275a3"}
```
