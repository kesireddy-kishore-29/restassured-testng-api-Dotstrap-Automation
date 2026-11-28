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
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-d1e5a6ff-7c68-4620-a28a-4eba8ae8829c` |
| 2 | `POST /v1/accounts` | 201 | 19 | `qa-d243a16c-2939-4963-b2bf-d3c996a47f33` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-12ba64b6-e61c-4c69-a6df-a0bb1f21617e` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-3e2eadd0-82a1-483d-b8a4-facdc379f0b4` |
| 5 | `POST /v1/conversations/{id}/messages` | 422 | 12 | `qa-2567c4e8-899e-4dad-8044-b63dde52d34b` |
| 6 | `POST /v1/auth/token` | 200 | 12 | `qa-439d7b73-2c7a-439e-9a58-9e39beb345fe` |
| 7 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-adba5fa4-4a6e-4348-b51d-17b7f8818343` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-dd057120-4ba9-487e-af79-70121de715f2` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-d3fe7778-dee1-4a3b-ade1-7cbc94c3c76e` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-b893d60e-b170-4189-8b81-32d8f076330e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d1e5a6ff-7c68-4620-a28a-4eba8ae8829c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1e5a6ff-7c68-4620-a28a-4eba8ae8829c
Content-Type: application/json

--- request body ---
{"handle":"qa-d22a6a6190dc","displayName":"QA d22a6a6190dc","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-d1e5a6ff-7c68-4620-a28a-4eba8ae8829c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 352
RateLimit-Reset: 8
Location: /v1/accounts/qa-d22a6a6190dc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4dc7467d-563b-4c23-bbf4-dcf98d0b4591","handle":"qa-d22a6a6190dc","displayName":"QA d22a6a6190dc","region":"eu","role":"user","createdAt":"2026-11-22T09:54:42.105645622Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d243a16c-2939-4963-b2bf-d3c996a47f33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d243a16c-2939-4963-b2bf-d3c996a47f33
Content-Type: application/json

--- request body ---
{"handle":"qa-50730aa5e3d5","displayName":"QA 50730aa5e3d5","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-d243a16c-2939-4963-b2bf-d3c996a47f33
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 346
RateLimit-Reset: 8
Location: /v1/accounts/qa-50730aa5e3d5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_820f1cca-3686-4432-b7b1-3f21deb1465b","handle":"qa-50730aa5e3d5","displayName":"QA 50730aa5e3d5","region":"eu","role":"user","createdAt":"2026-11-22T09:54:42.125807086Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-12ba64b6-e61c-4c69-a6df-a0bb1f21617e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12ba64b6-e61c-4c69-a6df-a0bb1f21617e
Content-Type: application/json

--- request body ---
{"handle":"qa-d22a6a6190dc","password":"****"}

--- response: 200 in 26 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-12ba64b6-e61c-4c69-a6df-a0bb1f21617e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 343
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4dc7467d-563b-4c23-bbf4-dcf98d0b4591"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3e2eadd0-82a1-483d-b8a4-facdc379f0b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e2eadd0-82a1-483d-b8a4-facdc379f0b4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-50730aa5e3d5","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e2eadd0-82a1-483d-b8a4-facdc379f0b4
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
Location: /v1/conversations/cnv_e98212f6-6825-4784-9129-6c6da80bbdc8
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e98212f6-6825-4784-9129-6c6da80bbdc8","subject":"Error contract","status":"open","region":"eu","participants":["qa-d22a6a6190dc","qa-50730aa5e3d5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:42.180495476Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_e98212f6-6825-4784-9129-6c6da80bbdc8/messages
correlation: qa-2567c4e8-899e-4dad-8044-b63dde52d34b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2567c4e8-899e-4dad-8044-b63dde52d34b
Content-Type: application/json

--- request body ---
{"body":" "}

--- response: 422 in 12 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2567c4e8-899e-4dad-8044-b63dde52d34b
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations/cnv_e98212f6-6825-4784-9129-6c6da80bbdc8/messages","correlationId":"qa-2567c4e8-899e-4dad-8044-b63dde52d34b","errors":[{"field":"body","message":"1-2000 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-439d7b73-2c7a-439e-9a58-9e39beb345fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-439d7b73-2c7a-439e-9a58-9e39beb345fe
Content-Type: application/json

--- request body ---
{"handle":"qa-50730aa5e3d5","password":"****"}

--- response: 200 in 12 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-439d7b73-2c7a-439e-9a58-9e39beb345fe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 323
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_820f1cca-3686-4432-b7b1-3f21deb1465b"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-adba5fa4-4a6e-4348-b51d-17b7f8818343

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-adba5fa4-4a6e-4348-b51d-17b7f8818343
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-adba5fa4-4a6e-4348-b51d-17b7f8818343
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
correlation: qa-dd057120-4ba9-487e-af79-70121de715f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd057120-4ba9-487e-af79-70121de715f2
Content-Type: application/json

--- request body ---
{"handle":"qa-50730aa5e3d5","password":"****"}

--- response: 401 in 15 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dd057120-4ba9-487e-af79-70121de715f2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 314
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dd057120-4ba9-487e-af79-70121de715f2"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d3fe7778-dee1-4a3b-ade1-7cbc94c3c76e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3fe7778-dee1-4a3b-ade1-7cbc94c3c76e
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d3fe7778-dee1-4a3b-ade1-7cbc94c3c76e
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
correlation: qa-b893d60e-b170-4189-8b81-32d8f076330e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b893d60e-b170-4189-8b81-32d8f076330e
Content-Type: application/json

--- request body ---
{"handle":"qa-d22a6a6190dc","password":"****"}

--- response: 401 in 12 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b893d60e-b170-4189-8b81-32d8f076330e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 309
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b893d60e-b170-4189-8b81-32d8f076330e"}
```
