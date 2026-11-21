# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[5]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-cad9980f-8671-4bb2-988a-2a77666f2edf` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-1f838cfa-3f25-429e-9ef3-8c9ac04b5349` |
| 3 | `POST /v1/auth/token` | 200 | 59 | `qa-94a56fca-4fb2-4539-9d69-d74f2f14aeef` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-37489e21-9c4d-4335-978f-c6b18f0eb7f5` |
| 5 | `POST /v1/accounts` | 422 | 13 | `qa-718d29c8-da82-4ad0-b87f-49e8bb6f351e` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-c46aa236-08b5-4af5-9930-6ca6eb857a46` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-8745ba97-e854-4e31-89d7-7ea1369463c5` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-5d858efc-2378-4c1c-97f3-c407b573088b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-3adc8aa3-54e7-461b-a24a-448c821ae686` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-eba6aa78-2144-4cfa-914d-1f8cb9181ed6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cad9980f-8671-4bb2-988a-2a77666f2edf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cad9980f-8671-4bb2-988a-2a77666f2edf
Content-Type: application/json

--- request body ---
{"handle":"qa-be544bbd7a6e","displayName":"QA be544bbd7a6e","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-cad9980f-8671-4bb2-988a-2a77666f2edf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 483
RateLimit-Reset: 8
Location: /v1/accounts/qa-be544bbd7a6e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dd94c2cf-b2fd-4db8-93c3-5ab901203f6a","handle":"qa-be544bbd7a6e","displayName":"QA be544bbd7a6e","region":"eu","role":"user","createdAt":"2026-11-17T10:50:18.870121169Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1f838cfa-3f25-429e-9ef3-8c9ac04b5349

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f838cfa-3f25-429e-9ef3-8c9ac04b5349
Content-Type: application/json

--- request body ---
{"handle":"qa-ee8fa2d06652","displayName":"QA ee8fa2d06652","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f838cfa-3f25-429e-9ef3-8c9ac04b5349
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 474
RateLimit-Reset: 8
Location: /v1/accounts/qa-ee8fa2d06652
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0e153302-69f7-4b18-a7bf-3fc5b2916c69","handle":"qa-ee8fa2d06652","displayName":"QA ee8fa2d06652","region":"eu","role":"user","createdAt":"2026-11-17T10:50:18.912654009Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-94a56fca-4fb2-4539-9d69-d74f2f14aeef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94a56fca-4fb2-4539-9d69-d74f2f14aeef
Content-Type: application/json

--- request body ---
{"handle":"qa-be544bbd7a6e","password":"****"}

--- response: 200 in 59 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-94a56fca-4fb2-4539-9d69-d74f2f14aeef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 458
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dd94c2cf-b2fd-4db8-93c3-5ab901203f6a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-37489e21-9c4d-4335-978f-c6b18f0eb7f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37489e21-9c4d-4335-978f-c6b18f0eb7f5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ee8fa2d06652","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-37489e21-9c4d-4335-978f-c6b18f0eb7f5
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
Location: /v1/conversations/cnv_fba1c6a8-6668-4753-9a65-67ffa19fbf63
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_fba1c6a8-6668-4753-9a65-67ffa19fbf63","subject":"Error contract","status":"open","region":"eu","participants":["qa-be544bbd7a6e","qa-ee8fa2d06652"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:19.038357309Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-718d29c8-da82-4ad0-b87f-49e8bb6f351e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-718d29c8-da82-4ad0-b87f-49e8bb6f351e
Content-Type: application/json

--- request body ---
{"handle":"ab","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 13 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-718d29c8-da82-4ad0-b87f-49e8bb6f351e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 446
RateLimit-Reset: 8
Content-Length: 338

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-718d29c8-da82-4ad0-b87f-49e8bb6f351e","errors":[{"field":"handle","message":"3-30 characters: a-z, 0-9 and '-', not starting with '-'"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c46aa236-08b5-4af5-9930-6ca6eb857a46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c46aa236-08b5-4af5-9930-6ca6eb857a46
Content-Type: application/json

--- request body ---
{"handle":"qa-ee8fa2d06652","password":"****"}

--- response: 200 in 24 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-c46aa236-08b5-4af5-9930-6ca6eb857a46
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 431
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0e153302-69f7-4b18-a7bf-3fc5b2916c69"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8745ba97-e854-4e31-89d7-7ea1369463c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8745ba97-e854-4e31-89d7-7ea1369463c5
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8745ba97-e854-4e31-89d7-7ea1369463c5
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
correlation: qa-5d858efc-2378-4c1c-97f3-c407b573088b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d858efc-2378-4c1c-97f3-c407b573088b
Content-Type: application/json

--- request body ---
{"handle":"qa-ee8fa2d06652","password":"****"}

--- response: 401 in 13 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5d858efc-2378-4c1c-97f3-c407b573088b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 417
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5d858efc-2378-4c1c-97f3-c407b573088b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3adc8aa3-54e7-461b-a24a-448c821ae686

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3adc8aa3-54e7-461b-a24a-448c821ae686
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3adc8aa3-54e7-461b-a24a-448c821ae686
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
correlation: qa-eba6aa78-2144-4cfa-914d-1f8cb9181ed6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eba6aa78-2144-4cfa-914d-1f8cb9181ed6
Content-Type: application/json

--- request body ---
{"handle":"qa-be544bbd7a6e","password":"****"}

--- response: 401 in 18 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eba6aa78-2144-4cfa-914d-1f8cb9181ed6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 407
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-eba6aa78-2144-4cfa-914d-1f8cb9181ed6"}
```
