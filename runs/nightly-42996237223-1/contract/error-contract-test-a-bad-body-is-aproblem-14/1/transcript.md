# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[14]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 45 | `qa-ca05df03-1979-4bc4-b2d2-1d3fe7600baf` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-b40fbf14-6f59-49fa-8a37-14ccfbb716e8` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-c40945ae-3026-4ab3-b58e-854b28642e7f` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-5cfd5ddc-8f67-4cea-a7be-07eeb842457b` |
| 5 | `POST /v1/conversations/{id}/messages` | 422 | 37 | `qa-e30ad17f-a75d-4cbf-9fb4-33faeb49fa45` |
| 6 | `POST /v1/auth/token` | 200 | 14 | `qa-ef0c038d-0910-431f-b86a-0bb2e6e101e7` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-92f8e8e4-9399-4b79-90fb-7c650d931ce4` |
| 8 | `POST /v1/auth/token` | 401 | 5 | `qa-651249cd-33be-4632-8092-d2646f64a15b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-c5d3772d-8933-4800-8f79-163871300711` |
| 10 | `POST /v1/auth/token` | 401 | 28 | `qa-6b44295a-56a9-4b99-ad38-0c1987465bd9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ca05df03-1979-4bc4-b2d2-1d3fe7600baf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca05df03-1979-4bc4-b2d2-1d3fe7600baf
Content-Type: application/json

--- request body ---
{"handle":"qa-e956a0843ef9","displayName":"QA e956a0843ef9","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-ca05df03-1979-4bc4-b2d2-1d3fe7600baf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 358
RateLimit-Reset: 7
Location: /v1/accounts/qa-e956a0843ef9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ada8396b-464e-43ca-84ab-1b7f2731b4ff","handle":"qa-e956a0843ef9","displayName":"QA e956a0843ef9","region":"eu","role":"user","createdAt":"2026-11-11T09:34:38.772420512Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b40fbf14-6f59-49fa-8a37-14ccfbb716e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b40fbf14-6f59-49fa-8a37-14ccfbb716e8
Content-Type: application/json

--- request body ---
{"handle":"qa-d7737e7f6203","displayName":"QA d7737e7f6203","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-b40fbf14-6f59-49fa-8a37-14ccfbb716e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 350
RateLimit-Reset: 7
Location: /v1/accounts/qa-d7737e7f6203
X-Served-Region: eu
Content-Length: 181

{"id":"acc_639adacd-f64a-4e20-b66f-d63b78ca23df","handle":"qa-d7737e7f6203","displayName":"QA d7737e7f6203","region":"eu","role":"user","createdAt":"2026-11-11T09:34:38.818706864Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c40945ae-3026-4ab3-b58e-854b28642e7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c40945ae-3026-4ab3-b58e-854b28642e7f
Content-Type: application/json

--- request body ---
{"handle":"qa-e956a0843ef9","password":"****"}

--- response: 200 in 27 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-c40945ae-3026-4ab3-b58e-854b28642e7f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 343
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ada8396b-464e-43ca-84ab-1b7f2731b4ff"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5cfd5ddc-8f67-4cea-a7be-07eeb842457b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5cfd5ddc-8f67-4cea-a7be-07eeb842457b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d7737e7f6203","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-5cfd5ddc-8f67-4cea-a7be-07eeb842457b
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
Location: /v1/conversations/cnv_d68f74dc-383e-402f-bd7f-49b869073dd3
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d68f74dc-383e-402f-bd7f-49b869073dd3","subject":"Error contract","status":"open","region":"eu","participants":["qa-e956a0843ef9","qa-d7737e7f6203"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:38.886625160Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_d68f74dc-383e-402f-bd7f-49b869073dd3/messages
correlation: qa-e30ad17f-a75d-4cbf-9fb4-33faeb49fa45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e30ad17f-a75d-4cbf-9fb4-33faeb49fa45
Content-Type: application/json

--- request body ---
{"body":" "}

--- response: 422 in 37 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e30ad17f-a75d-4cbf-9fb4-33faeb49fa45
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
Content-Length: 363

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations/cnv_d68f74dc-383e-402f-bd7f-49b869073dd3/messages","correlationId":"qa-e30ad17f-a75d-4cbf-9fb4-33faeb49fa45","errors":[{"field":"body","message":"1-2000 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ef0c038d-0910-431f-b86a-0bb2e6e101e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef0c038d-0910-431f-b86a-0bb2e6e101e7
Content-Type: application/json

--- request body ---
{"handle":"qa-d7737e7f6203","password":"****"}

--- response: 200 in 14 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef0c038d-0910-431f-b86a-0bb2e6e101e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 327
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_639adacd-f64a-4e20-b66f-d63b78ca23df"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-92f8e8e4-9399-4b79-90fb-7c650d931ce4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92f8e8e4-9399-4b79-90fb-7c650d931ce4
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-92f8e8e4-9399-4b79-90fb-7c650d931ce4
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
correlation: qa-651249cd-33be-4632-8092-d2646f64a15b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-651249cd-33be-4632-8092-d2646f64a15b
Content-Type: application/json

--- request body ---
{"handle":"qa-d7737e7f6203","password":"****"}

--- response: 401 in 5 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-651249cd-33be-4632-8092-d2646f64a15b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 324
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-651249cd-33be-4632-8092-d2646f64a15b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c5d3772d-8933-4800-8f79-163871300711

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5d3772d-8933-4800-8f79-163871300711
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c5d3772d-8933-4800-8f79-163871300711
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
correlation: qa-6b44295a-56a9-4b99-ad38-0c1987465bd9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b44295a-56a9-4b99-ad38-0c1987465bd9
Content-Type: application/json

--- request body ---
{"handle":"qa-e956a0843ef9","password":"****"}

--- response: 401 in 28 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6b44295a-56a9-4b99-ad38-0c1987465bd9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 319
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6b44295a-56a9-4b99-ad38-0c1987465bd9"}
```
