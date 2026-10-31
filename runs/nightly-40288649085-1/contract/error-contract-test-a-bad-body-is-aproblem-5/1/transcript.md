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
| 1 | `POST /v1/accounts` | 201 | 42 | `qa-fba30e27-b06f-435c-9587-0e18575ed18b` |
| 2 | `POST /v1/accounts` | 201 | 43 | `qa-005149ed-e5f4-41c1-8711-2c39fb89e2fd` |
| 3 | `POST /v1/auth/token` | 200 | 40 | `qa-df7ebebd-9355-48d7-99e2-900d431c6c24` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-0a98010a-f30f-4d54-ae72-7821d399371d` |
| 5 | `POST /v1/accounts` | 422 | 23 | `qa-7525e668-435f-4147-85e9-f03f2df6f47f` |
| 6 | `POST /v1/auth/token` | 200 | 41 | `qa-da33f277-0511-46d4-85d5-bad5c1ad8a7d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-2bccceff-6110-48b8-9c04-a0fbc51793b2` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-6fe1febb-f974-41c4-9eb4-97f4a7b0190d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-0be3ff97-8687-440b-88bb-68104e8cd0a2` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-845446f5-c169-4601-a322-bfd33fb6fffb` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fba30e27-b06f-435c-9587-0e18575ed18b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fba30e27-b06f-435c-9587-0e18575ed18b
Content-Type: application/json

--- request body ---
{"handle":"qa-5ee1ad4dafc1","displayName":"QA 5ee1ad4dafc1","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-fba30e27-b06f-435c-9587-0e18575ed18b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 469
RateLimit-Reset: 8
Location: /v1/accounts/qa-5ee1ad4dafc1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_21f30701-e475-4cbc-b476-f7b22dd34ff0","handle":"qa-5ee1ad4dafc1","displayName":"QA 5ee1ad4dafc1","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.558843108Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-005149ed-e5f4-41c1-8711-2c39fb89e2fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-005149ed-e5f4-41c1-8711-2c39fb89e2fd
Content-Type: application/json

--- request body ---
{"handle":"qa-43790ef957cf","displayName":"QA 43790ef957cf","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-005149ed-e5f4-41c1-8711-2c39fb89e2fd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 455
RateLimit-Reset: 8
Location: /v1/accounts/qa-43790ef957cf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_501f9961-81e2-42eb-9b88-5bc24fa6ab29","handle":"qa-43790ef957cf","displayName":"QA 43790ef957cf","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.641662147Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-df7ebebd-9355-48d7-99e2-900d431c6c24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df7ebebd-9355-48d7-99e2-900d431c6c24
Content-Type: application/json

--- request body ---
{"handle":"qa-5ee1ad4dafc1","password":"****"}

--- response: 200 in 40 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-df7ebebd-9355-48d7-99e2-900d431c6c24
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 452
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_21f30701-e475-4cbc-b476-f7b22dd34ff0"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0a98010a-f30f-4d54-ae72-7821d399371d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a98010a-f30f-4d54-ae72-7821d399371d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-43790ef957cf","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a98010a-f30f-4d54-ae72-7821d399371d
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
Location: /v1/conversations/cnv_5211e082-60b3-4432-a75f-817d3ec05b58
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5211e082-60b3-4432-a75f-817d3ec05b58","subject":"Error contract","status":"open","region":"eu","participants":["qa-5ee1ad4dafc1","qa-43790ef957cf"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:47.726939658Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-7525e668-435f-4147-85e9-f03f2df6f47f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7525e668-435f-4147-85e9-f03f2df6f47f
Content-Type: application/json

--- request body ---
{"handle":"ab","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 23 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7525e668-435f-4147-85e9-f03f2df6f47f
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-7525e668-435f-4147-85e9-f03f2df6f47f","errors":[{"field":"handle","message":"3-30 characters: a-z, 0-9 and '-', not starting with '-'"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-da33f277-0511-46d4-85d5-bad5c1ad8a7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da33f277-0511-46d4-85d5-bad5c1ad8a7d
Content-Type: application/json

--- request body ---
{"handle":"qa-43790ef957cf","password":"****"}

--- response: 200 in 41 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-da33f277-0511-46d4-85d5-bad5c1ad8a7d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 427
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_501f9961-81e2-42eb-9b88-5bc24fa6ab29"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2bccceff-6110-48b8-9c04-a0fbc51793b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bccceff-6110-48b8-9c04-a0fbc51793b2
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2bccceff-6110-48b8-9c04-a0fbc51793b2
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
correlation: qa-6fe1febb-f974-41c4-9eb4-97f4a7b0190d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6fe1febb-f974-41c4-9eb4-97f4a7b0190d
Content-Type: application/json

--- request body ---
{"handle":"qa-43790ef957cf","password":"****"}

--- response: 401 in 14 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6fe1febb-f974-41c4-9eb4-97f4a7b0190d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 412
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6fe1febb-f974-41c4-9eb4-97f4a7b0190d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0be3ff97-8687-440b-88bb-68104e8cd0a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0be3ff97-8687-440b-88bb-68104e8cd0a2
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0be3ff97-8687-440b-88bb-68104e8cd0a2
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
correlation: qa-845446f5-c169-4601-a322-bfd33fb6fffb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-845446f5-c169-4601-a322-bfd33fb6fffb
Content-Type: application/json

--- request body ---
{"handle":"qa-5ee1ad4dafc1","password":"****"}

--- response: 401 in 13 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-845446f5-c169-4601-a322-bfd33fb6fffb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 402
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-845446f5-c169-4601-a322-bfd33fb6fffb"}
```
