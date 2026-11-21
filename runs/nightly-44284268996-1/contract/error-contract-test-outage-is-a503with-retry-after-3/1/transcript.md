# Transcript: Every operation answers an outage with a 503 problem and Retry-After [PATCH /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[3]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-bb2bbc1b-89c8-4459-aa4e-2e8cb46891fc` |
| 2 | `POST /v1/accounts` | 201 | 15 | `qa-c930e930-8931-4135-bc50-07af3d71a55b` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-d7d55fdc-89b4-45f0-9a6e-27d950aee88a` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-fe8eb5e8-e192-4f6d-ae88-3824dcbf26ba` |
| 5 | `PATCH /v1/accounts/me` | 503 | 15 | `qa-9e13ecbe-3953-4949-bd18-c3fa747e6779` |
| 6 | `POST /v1/auth/token` | 200 | 33 | `qa-7393d4fc-84f4-4fd1-942c-dacf110d3826` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-3fae81f4-4dfd-4f77-ba73-daed4289ecaf` |
| 8 | `POST /v1/auth/token` | 401 | 34 | `qa-22d9faff-4ba9-4ba2-b3a1-0c989c5642fc` |
| 9 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-8fb01205-a8f3-4b40-ae72-3f6e37d5d6f0` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-e8cb3df6-9abc-4fe2-be6b-e32c30d4b586` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bb2bbc1b-89c8-4459-aa4e-2e8cb46891fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb2bbc1b-89c8-4459-aa4e-2e8cb46891fc
Content-Type: application/json

--- request body ---
{"handle":"qa-997a278d24a8","displayName":"QA 997a278d24a8","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb2bbc1b-89c8-4459-aa4e-2e8cb46891fc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 10
Location: /v1/accounts/qa-997a278d24a8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bc0ea2a4-a0f9-4410-b3b3-c4bdd88865bd","handle":"qa-997a278d24a8","displayName":"QA 997a278d24a8","region":"eu","role":"user","createdAt":"2026-11-18T10:19:50.528858685Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c930e930-8931-4135-bc50-07af3d71a55b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c930e930-8931-4135-bc50-07af3d71a55b
Content-Type: application/json

--- request body ---
{"handle":"qa-c2896348a12b","displayName":"QA c2896348a12b","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-c930e930-8931-4135-bc50-07af3d71a55b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 10
Location: /v1/accounts/qa-c2896348a12b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9bfef1a7-d49c-433d-b609-2124037fc0bd","handle":"qa-c2896348a12b","displayName":"QA c2896348a12b","region":"eu","role":"user","createdAt":"2026-11-18T10:19:50.566316532Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d7d55fdc-89b4-45f0-9a6e-27d950aee88a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7d55fdc-89b4-45f0-9a6e-27d950aee88a
Content-Type: application/json

--- request body ---
{"handle":"qa-997a278d24a8","password":"****"}

--- response: 200 in 16 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-d7d55fdc-89b4-45f0-9a6e-27d950aee88a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 556
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bc0ea2a4-a0f9-4410-b3b3-c4bdd88865bd"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-fe8eb5e8-e192-4f6d-ae88-3824dcbf26ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe8eb5e8-e192-4f6d-ae88-3824dcbf26ba
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c2896348a12b","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-fe8eb5e8-e192-4f6d-ae88-3824dcbf26ba
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
Location: /v1/conversations/cnv_fc1a5ea2-2f08-4447-a6e3-5c2bf49259df
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_fc1a5ea2-2f08-4447-a6e3-5c2bf49259df","subject":"Error contract","status":"open","region":"eu","participants":["qa-997a278d24a8","qa-c2896348a12b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:50.615295537Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-9e13ecbe-3953-4949-bd18-c3fa747e6779

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: d344ba18-5988-4e64-84ff-2f46eee3d6d8
X-Correlation-Id: qa-9e13ecbe-3953-4949-bd18-c3fa747e6779
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 503 in 15 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9e13ecbe-3953-4949-bd18-c3fa747e6779
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-9e13ecbe-3953-4949-bd18-c3fa747e6779"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7393d4fc-84f4-4fd1-942c-dacf110d3826

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7393d4fc-84f4-4fd1-942c-dacf110d3826
Content-Type: application/json

--- request body ---
{"handle":"qa-c2896348a12b","password":"****"}

--- response: 200 in 33 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-7393d4fc-84f4-4fd1-942c-dacf110d3826
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 525
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9bfef1a7-d49c-433d-b609-2124037fc0bd"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3fae81f4-4dfd-4f77-ba73-daed4289ecaf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3fae81f4-4dfd-4f77-ba73-daed4289ecaf
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3fae81f4-4dfd-4f77-ba73-daed4289ecaf
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
correlation: qa-22d9faff-4ba9-4ba2-b3a1-0c989c5642fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22d9faff-4ba9-4ba2-b3a1-0c989c5642fc
Content-Type: application/json

--- request body ---
{"handle":"qa-c2896348a12b","password":"****"}

--- response: 401 in 34 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-22d9faff-4ba9-4ba2-b3a1-0c989c5642fc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 502
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-22d9faff-4ba9-4ba2-b3a1-0c989c5642fc"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8fb01205-a8f3-4b40-ae72-3f6e37d5d6f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8fb01205-a8f3-4b40-ae72-3f6e37d5d6f0
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8fb01205-a8f3-4b40-ae72-3f6e37d5d6f0
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
correlation: qa-e8cb3df6-9abc-4fe2-be6b-e32c30d4b586

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8cb3df6-9abc-4fe2-be6b-e32c30d4b586
Content-Type: application/json

--- request body ---
{"handle":"qa-997a278d24a8","password":"****"}

--- response: 401 in 14 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e8cb3df6-9abc-4fe2-be6b-e32c30d4b586
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 489
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e8cb3df6-9abc-4fe2-be6b-e32c30d4b586"}
```
