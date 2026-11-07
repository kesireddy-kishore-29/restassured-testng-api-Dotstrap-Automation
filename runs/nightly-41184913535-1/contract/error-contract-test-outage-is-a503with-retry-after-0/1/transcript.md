# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/auth/token]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[0]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 659 | `qa-e6e74de6-4f40-4d95-bdca-611926b9af34` |
| 2 | `POST /v1/accounts` | 201 | 94 | `qa-78ffa9fa-d482-47fa-9b56-238d836df226` |
| 3 | `POST /v1/auth/token` | 200 | 51 | `qa-6d61c67f-0636-47d3-8d29-ec43392a74ff` |
| 4 | `POST /v1/conversations` | 201 | 73 | `qa-fab93b91-87bd-47bf-9b2f-350f4069302f` |
| 5 | `POST /v1/auth/token` | 503 | 24 | `qa-40cd1f76-7e2b-4fd9-bb2c-06976a502b68` |
| 6 | `POST /v1/auth/token` | 200 | 42 | `qa-e29e94b5-73ed-4eb0-a986-66b2458e6311` |
| 7 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-b7989244-bed4-4744-949e-d00c86ffe657` |
| 8 | `POST /v1/auth/token` | 401 | 45 | `qa-9724857f-8007-467c-b4dc-cad5f09d7c19` |
| 9 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-558f9ae0-ba91-4c36-b243-6134a93e7ce7` |
| 10 | `POST /v1/auth/token` | 401 | 25 | `qa-2d31c70b-322d-4b12-a02b-d22599c0f7ab` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e6e74de6-4f40-4d95-bdca-611926b9af34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6e74de6-4f40-4d95-bdca-611926b9af34
Content-Type: application/json

--- request body ---
{"handle":"qa-9ff672b88caf","displayName":"QA 9ff672b88caf","password":"****","region":"eu"}

--- response: 201 in 659 ms ---
Date: Sat, 31 Oct 2026 08:31:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-e6e74de6-4f40-4d95-bdca-611926b9af34
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-9ff672b88caf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_15de25bd-b743-4e8f-b827-a15fafb54bf9","handle":"qa-9ff672b88caf","displayName":"QA 9ff672b88caf","region":"eu","role":"user","createdAt":"2026-10-31T08:31:32.884391585Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-78ffa9fa-d482-47fa-9b56-238d836df226

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78ffa9fa-d482-47fa-9b56-238d836df226
Content-Type: application/json

--- request body ---
{"handle":"qa-c725b0db0f7d","displayName":"QA c725b0db0f7d","password":"****","region":"eu"}

--- response: 201 in 94 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-78ffa9fa-d482-47fa-9b56-238d836df226
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 10
Location: /v1/accounts/qa-c725b0db0f7d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4d5611fb-18af-4398-be57-08517ac89b60","handle":"qa-c725b0db0f7d","displayName":"QA c725b0db0f7d","region":"eu","role":"user","createdAt":"2026-10-31T08:31:33.321978129Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6d61c67f-0636-47d3-8d29-ec43392a74ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d61c67f-0636-47d3-8d29-ec43392a74ff
Content-Type: application/json

--- request body ---
{"handle":"qa-9ff672b88caf","password":"****"}

--- response: 200 in 51 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d61c67f-0636-47d3-8d29-ec43392a74ff
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_15de25bd-b743-4e8f-b827-a15fafb54bf9"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-fab93b91-87bd-47bf-9b2f-350f4069302f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fab93b91-87bd-47bf-9b2f-350f4069302f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c725b0db0f7d","subject":"Error contract","message":"Hi"}

--- response: 201 in 73 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-fab93b91-87bd-47bf-9b2f-350f4069302f
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
Location: /v1/conversations/cnv_26fa2395-830a-4dca-b767-f2d3ba392c2b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_26fa2395-830a-4dca-b767-f2d3ba392c2b","subject":"Error contract","status":"open","region":"eu","participants":["qa-9ff672b88caf","qa-c725b0db0f7d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:33.568975565Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-40cd1f76-7e2b-4fd9-bb2c-06976a502b68

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: e6da0252-18a0-4e86-99ba-05b0028312bb
X-Correlation-Id: qa-40cd1f76-7e2b-4fd9-bb2c-06976a502b68
Content-Type: application/json

--- request body ---
{"handle":"qa-9ff672b88caf","password":"****"}

--- response: 503 in 24 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-40cd1f76-7e2b-4fd9-bb2c-06976a502b68
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 258

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/auth/token","correlationId":"qa-40cd1f76-7e2b-4fd9-bb2c-06976a502b68"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e29e94b5-73ed-4eb0-a986-66b2458e6311

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e29e94b5-73ed-4eb0-a986-66b2458e6311
Content-Type: application/json

--- request body ---
{"handle":"qa-c725b0db0f7d","password":"****"}

--- response: 200 in 42 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-e29e94b5-73ed-4eb0-a986-66b2458e6311
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 547
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4d5611fb-18af-4398-be57-08517ac89b60"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b7989244-bed4-4744-949e-d00c86ffe657

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7989244-bed4-4744-949e-d00c86ffe657
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b7989244-bed4-4744-949e-d00c86ffe657
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
correlation: qa-9724857f-8007-467c-b4dc-cad5f09d7c19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9724857f-8007-467c-b4dc-cad5f09d7c19
Content-Type: application/json

--- request body ---
{"handle":"qa-c725b0db0f7d","password":"****"}

--- response: 401 in 45 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9724857f-8007-467c-b4dc-cad5f09d7c19
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 534
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9724857f-8007-467c-b4dc-cad5f09d7c19"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-558f9ae0-ba91-4c36-b243-6134a93e7ce7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-558f9ae0-ba91-4c36-b243-6134a93e7ce7
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-558f9ae0-ba91-4c36-b243-6134a93e7ce7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-2d31c70b-322d-4b12-a02b-d22599c0f7ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d31c70b-322d-4b12-a02b-d22599c0f7ab
Content-Type: application/json

--- request body ---
{"handle":"qa-9ff672b88caf","password":"****"}

--- response: 401 in 25 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2d31c70b-322d-4b12-a02b-d22599c0f7ab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 524
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2d31c70b-322d-4b12-a02b-d22599c0f7ab"}
```
