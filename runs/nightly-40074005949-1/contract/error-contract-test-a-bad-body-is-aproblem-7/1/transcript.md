# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[7]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-9529d4b7-c16b-41d0-bc81-eb91055a9656` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-ba963295-8e29-44c2-b6a8-215a5a77a31e` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-ed136c22-be61-46d5-9352-759243a104b1` |
| 4 | `POST /v1/conversations` | 201 | 25 | `qa-91a93ad0-60e4-4e22-95e4-75d0fbb8554c` |
| 5 | `PATCH /v1/accounts/me` | 415 | 6 | `qa-917e56be-035c-4339-b0ac-c8780253e852` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-51cf219e-964a-431a-b5b9-d6add28cf729` |
| 7 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-53c3bfda-4e68-4efe-b68f-9f8795b61691` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-300fb580-7f6a-4f7a-afa3-3cbe81d164b5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-6927f30a-b26e-474d-8996-86ee6a69369d` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-75e713c9-3a96-4bfa-9870-eb22ba01851c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9529d4b7-c16b-41d0-bc81-eb91055a9656

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9529d4b7-c16b-41d0-bc81-eb91055a9656
Content-Type: application/json

--- request body ---
{"handle":"qa-94124dc0a483","displayName":"QA 94124dc0a483","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-9529d4b7-c16b-41d0-bc81-eb91055a9656
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 473
RateLimit-Reset: 8
Location: /v1/accounts/qa-94124dc0a483
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7d5f54b4-fa6c-45eb-8af8-04b899ebb770","handle":"qa-94124dc0a483","displayName":"QA 94124dc0a483","region":"eu","role":"user","createdAt":"2026-10-24T07:25:02.961255552Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ba963295-8e29-44c2-b6a8-215a5a77a31e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba963295-8e29-44c2-b6a8-215a5a77a31e
Content-Type: application/json

--- request body ---
{"handle":"qa-87ea5b9ccd4b","displayName":"QA 87ea5b9ccd4b","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba963295-8e29-44c2-b6a8-215a5a77a31e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 471
RateLimit-Reset: 8
Location: /v1/accounts/qa-87ea5b9ccd4b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3dcbae6f-63d3-4f90-830e-2fef4035c418","handle":"qa-87ea5b9ccd4b","displayName":"QA 87ea5b9ccd4b","region":"eu","role":"user","createdAt":"2026-10-24T07:25:02.980358601Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ed136c22-be61-46d5-9352-759243a104b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed136c22-be61-46d5-9352-759243a104b1
Content-Type: application/json

--- request body ---
{"handle":"qa-94124dc0a483","password":"****"}

--- response: 200 in 32 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed136c22-be61-46d5-9352-759243a104b1
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7d5f54b4-fa6c-45eb-8af8-04b899ebb770"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-91a93ad0-60e4-4e22-95e4-75d0fbb8554c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91a93ad0-60e4-4e22-95e4-75d0fbb8554c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-87ea5b9ccd4b","subject":"Error contract","message":"Hi"}

--- response: 201 in 25 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-91a93ad0-60e4-4e22-95e4-75d0fbb8554c
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
Location: /v1/conversations/cnv_e46c66c0-0ac3-4649-868f-0edb6f24b569
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e46c66c0-0ac3-4649-868f-0edb6f24b569","subject":"Error contract","status":"open","region":"eu","participants":["qa-94124dc0a483","qa-87ea5b9ccd4b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:03.055075746Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-917e56be-035c-4339-b0ac-c8780253e852

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-917e56be-035c-4339-b0ac-c8780253e852
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-917e56be-035c-4339-b0ac-c8780253e852
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
Content-Length: 255

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts/me","correlationId":"qa-917e56be-035c-4339-b0ac-c8780253e852"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-51cf219e-964a-431a-b5b9-d6add28cf729

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51cf219e-964a-431a-b5b9-d6add28cf729
Content-Type: application/json

--- request body ---
{"handle":"qa-87ea5b9ccd4b","password":"****"}

--- response: 200 in 29 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-51cf219e-964a-431a-b5b9-d6add28cf729
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 440
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3dcbae6f-63d3-4f90-830e-2fef4035c418"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-53c3bfda-4e68-4efe-b68f-9f8795b61691

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53c3bfda-4e68-4efe-b68f-9f8795b61691
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-53c3bfda-4e68-4efe-b68f-9f8795b61691
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
correlation: qa-300fb580-7f6a-4f7a-afa3-3cbe81d164b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-300fb580-7f6a-4f7a-afa3-3cbe81d164b5
Content-Type: application/json

--- request body ---
{"handle":"qa-87ea5b9ccd4b","password":"****"}

--- response: 401 in 9 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-300fb580-7f6a-4f7a-afa3-3cbe81d164b5
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-300fb580-7f6a-4f7a-afa3-3cbe81d164b5"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6927f30a-b26e-474d-8996-86ee6a69369d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6927f30a-b26e-474d-8996-86ee6a69369d
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6927f30a-b26e-474d-8996-86ee6a69369d
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
correlation: qa-75e713c9-3a96-4bfa-9870-eb22ba01851c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75e713c9-3a96-4bfa-9870-eb22ba01851c
Content-Type: application/json

--- request body ---
{"handle":"qa-94124dc0a483","password":"****"}

--- response: 401 in 15 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-75e713c9-3a96-4bfa-9870-eb22ba01851c
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-75e713c9-3a96-4bfa-9870-eb22ba01851c"}
```
