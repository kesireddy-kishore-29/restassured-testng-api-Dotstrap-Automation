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
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-0db02e8f-7e8c-4f14-bbb5-8ca084404b7a` |
| 2 | `POST /v1/accounts` | 201 | 16 | `qa-2ef4a68c-010f-41f5-97e5-5e1df340f351` |
| 3 | `POST /v1/auth/token` | 200 | 52 | `qa-38871471-a640-4b28-8446-6397d23100cb` |
| 4 | `POST /v1/conversations` | 201 | 23 | `qa-08f9aa50-8084-4878-a131-0b2b00d8473d` |
| 5 | `POST /v1/accounts` | 422 | 22 | `qa-230fa927-7ae5-479b-823c-9abee87464b1` |
| 6 | `POST /v1/auth/token` | 200 | 38 | `qa-0fc97ee8-916a-4802-bc95-51e57ed9439b` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-d1fd32e2-c1ca-4bd3-b356-743d3f8115ae` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-79b96e6e-357c-4955-b6e2-2faf2762a497` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-9189e601-2824-4898-8482-178fdf4891b2` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-56b55a9f-8429-467f-b67a-23ffc4187939` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0db02e8f-7e8c-4f14-bbb5-8ca084404b7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0db02e8f-7e8c-4f14-bbb5-8ca084404b7a
Content-Type: application/json

--- request body ---
{"handle":"qa-4399b73f0860","displayName":"QA 4399b73f0860","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-0db02e8f-7e8c-4f14-bbb5-8ca084404b7a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 503
RateLimit-Reset: 9
Location: /v1/accounts/qa-4399b73f0860
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ce57931c-0348-4889-b201-84b00d9378f2","handle":"qa-4399b73f0860","displayName":"QA 4399b73f0860","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.404659147Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2ef4a68c-010f-41f5-97e5-5e1df340f351

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ef4a68c-010f-41f5-97e5-5e1df340f351
Content-Type: application/json

--- request body ---
{"handle":"qa-17a111e638a8","displayName":"QA 17a111e638a8","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ef4a68c-010f-41f5-97e5-5e1df340f351
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 493
RateLimit-Reset: 9
Location: /v1/accounts/qa-17a111e638a8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4a0e7674-239f-48b5-82ba-b10f1a2d9061","handle":"qa-17a111e638a8","displayName":"QA 17a111e638a8","region":"eu","role":"user","createdAt":"2026-11-04T09:28:02.424866301Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-38871471-a640-4b28-8446-6397d23100cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38871471-a640-4b28-8446-6397d23100cb
Content-Type: application/json

--- request body ---
{"handle":"qa-4399b73f0860","password":"****"}

--- response: 200 in 52 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-38871471-a640-4b28-8446-6397d23100cb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 482
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ce57931c-0348-4889-b201-84b00d9378f2"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-08f9aa50-8084-4878-a131-0b2b00d8473d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08f9aa50-8084-4878-a131-0b2b00d8473d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-17a111e638a8","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-08f9aa50-8084-4878-a131-0b2b00d8473d
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
Location: /v1/conversations/cnv_f878f410-c301-404b-a37d-065dba831c51
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f878f410-c301-404b-a37d-065dba831c51","subject":"Error contract","status":"open","region":"eu","participants":["qa-4399b73f0860","qa-17a111e638a8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:02.531291857Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-230fa927-7ae5-479b-823c-9abee87464b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-230fa927-7ae5-479b-823c-9abee87464b1
Content-Type: application/json

--- request body ---
{"handle":"ab","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 22 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-230fa927-7ae5-479b-823c-9abee87464b1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 470
RateLimit-Reset: 9
Content-Length: 338

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-230fa927-7ae5-479b-823c-9abee87464b1","errors":[{"field":"handle","message":"3-30 characters: a-z, 0-9 and '-', not starting with '-'"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0fc97ee8-916a-4802-bc95-51e57ed9439b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0fc97ee8-916a-4802-bc95-51e57ed9439b
Content-Type: application/json

--- request body ---
{"handle":"qa-17a111e638a8","password":"****"}

--- response: 200 in 38 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-0fc97ee8-916a-4802-bc95-51e57ed9439b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 453
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4a0e7674-239f-48b5-82ba-b10f1a2d9061"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d1fd32e2-c1ca-4bd3-b356-743d3f8115ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1fd32e2-c1ca-4bd3-b356-743d3f8115ae
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d1fd32e2-c1ca-4bd3-b356-743d3f8115ae
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
correlation: qa-79b96e6e-357c-4955-b6e2-2faf2762a497

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79b96e6e-357c-4955-b6e2-2faf2762a497
Content-Type: application/json

--- request body ---
{"handle":"qa-17a111e638a8","password":"****"}

--- response: 401 in 11 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-79b96e6e-357c-4955-b6e2-2faf2762a497
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 445
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-79b96e6e-357c-4955-b6e2-2faf2762a497"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9189e601-2824-4898-8482-178fdf4891b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9189e601-2824-4898-8482-178fdf4891b2
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9189e601-2824-4898-8482-178fdf4891b2
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
correlation: qa-56b55a9f-8429-467f-b67a-23ffc4187939

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56b55a9f-8429-467f-b67a-23ffc4187939
Content-Type: application/json

--- request body ---
{"handle":"qa-4399b73f0860","password":"****"}

--- response: 401 in 17 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-56b55a9f-8429-467f-b67a-23ffc4187939
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 433
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-56b55a9f-8429-467f-b67a-23ffc4187939"}
```
