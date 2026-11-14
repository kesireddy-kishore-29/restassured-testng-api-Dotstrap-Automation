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
| 1 | `POST /v1/accounts` | 201 | 49 | `qa-3841142b-b439-4d5b-af27-86efd912feec` |
| 2 | `POST /v1/accounts` | 201 | 58 | `qa-eae9f760-bb64-440a-a6de-e82825d51359` |
| 3 | `POST /v1/auth/token` | 200 | 54 | `qa-972fabd2-75f0-4d4f-9046-8985791ac9ee` |
| 4 | `POST /v1/conversations` | 201 | 45 | `qa-3f88b3e0-4945-4c70-897e-cf58ec0f5a5e` |
| 5 | `PATCH /v1/accounts/me` | 415 | 17 | `qa-6d62534d-79c1-4389-9c89-d34601b286c3` |
| 6 | `POST /v1/auth/token` | 200 | 38 | `qa-c2ca0e31-281c-4366-b1e7-3a6280445ffd` |
| 7 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-4dbcd879-3e84-444f-92db-6bf2ae48c2a5` |
| 8 | `POST /v1/auth/token` | 401 | 27 | `qa-90bea91e-cbfe-4fbf-90ab-42853990836f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-77dfd5c0-3d12-49bd-87cf-5a795448d476` |
| 10 | `POST /v1/auth/token` | 401 | 23 | `qa-bde529b6-34f8-4d2b-855e-749b1b7f730d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3841142b-b439-4d5b-af27-86efd912feec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3841142b-b439-4d5b-af27-86efd912feec
Content-Type: application/json

--- request body ---
{"handle":"qa-519551cda40e","displayName":"QA 519551cda40e","password":"****","region":"eu"}

--- response: 201 in 49 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-3841142b-b439-4d5b-af27-86efd912feec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 472
RateLimit-Reset: 8
Location: /v1/accounts/qa-519551cda40e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_176682b3-0d87-4bb3-976d-fff2453417a5","handle":"qa-519551cda40e","displayName":"QA 519551cda40e","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.015317786Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-eae9f760-bb64-440a-a6de-e82825d51359

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eae9f760-bb64-440a-a6de-e82825d51359
Content-Type: application/json

--- request body ---
{"handle":"qa-42a10fae36d8","displayName":"QA 42a10fae36d8","password":"****","region":"eu"}

--- response: 201 in 58 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-eae9f760-bb64-440a-a6de-e82825d51359
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 460
RateLimit-Reset: 7
Location: /v1/accounts/qa-42a10fae36d8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_aaed5360-edff-4a48-bc51-8543fac08e0d","handle":"qa-42a10fae36d8","displayName":"QA 42a10fae36d8","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.098073360Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-972fabd2-75f0-4d4f-9046-8985791ac9ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-972fabd2-75f0-4d4f-9046-8985791ac9ee
Content-Type: application/json

--- request body ---
{"handle":"qa-519551cda40e","password":"****"}

--- response: 200 in 54 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-972fabd2-75f0-4d4f-9046-8985791ac9ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 449
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_176682b3-0d87-4bb3-976d-fff2453417a5"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3f88b3e0-4945-4c70-897e-cf58ec0f5a5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f88b3e0-4945-4c70-897e-cf58ec0f5a5e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-42a10fae36d8","subject":"Error contract","message":"Hi"}

--- response: 201 in 45 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f88b3e0-4945-4c70-897e-cf58ec0f5a5e
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
Location: /v1/conversations/cnv_d524f605-7a5b-42b9-88d5-bc3cbee49625
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d524f605-7a5b-42b9-88d5-bc3cbee49625","subject":"Error contract","status":"open","region":"eu","participants":["qa-519551cda40e","qa-42a10fae36d8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:33.253410488Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-6d62534d-79c1-4389-9c89-d34601b286c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d62534d-79c1-4389-9c89-d34601b286c3
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 17 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6d62534d-79c1-4389-9c89-d34601b286c3
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts/me","correlationId":"qa-6d62534d-79c1-4389-9c89-d34601b286c3"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c2ca0e31-281c-4366-b1e7-3a6280445ffd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2ca0e31-281c-4366-b1e7-3a6280445ffd
Content-Type: application/json

--- request body ---
{"handle":"qa-42a10fae36d8","password":"****"}

--- response: 200 in 38 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-c2ca0e31-281c-4366-b1e7-3a6280445ffd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 433
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_aaed5360-edff-4a48-bc51-8543fac08e0d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4dbcd879-3e84-444f-92db-6bf2ae48c2a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4dbcd879-3e84-444f-92db-6bf2ae48c2a5
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4dbcd879-3e84-444f-92db-6bf2ae48c2a5
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
correlation: qa-90bea91e-cbfe-4fbf-90ab-42853990836f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90bea91e-cbfe-4fbf-90ab-42853990836f
Content-Type: application/json

--- request body ---
{"handle":"qa-42a10fae36d8","password":"****"}

--- response: 401 in 27 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-90bea91e-cbfe-4fbf-90ab-42853990836f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 421
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-90bea91e-cbfe-4fbf-90ab-42853990836f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-77dfd5c0-3d12-49bd-87cf-5a795448d476

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77dfd5c0-3d12-49bd-87cf-5a795448d476
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-77dfd5c0-3d12-49bd-87cf-5a795448d476
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
correlation: qa-bde529b6-34f8-4d2b-855e-749b1b7f730d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bde529b6-34f8-4d2b-855e-749b1b7f730d
Content-Type: application/json

--- request body ---
{"handle":"qa-519551cda40e","password":"****"}

--- response: 401 in 23 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bde529b6-34f8-4d2b-855e-749b1b7f730d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 409
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bde529b6-34f8-4d2b-855e-749b1b7f730d"}
```
