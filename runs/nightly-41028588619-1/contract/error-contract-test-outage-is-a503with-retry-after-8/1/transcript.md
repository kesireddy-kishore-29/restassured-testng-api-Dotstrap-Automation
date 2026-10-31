# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[8]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-3d32191b-29bd-4f65-b578-fb93ba073488` |
| 2 | `POST /v1/accounts` | 201 | 39 | `qa-a9e8e7e4-9f60-49b3-8b65-33f9d5653a7f` |
| 3 | `POST /v1/auth/token` | 200 | 48 | `qa-30cc65cc-3b1e-490a-8a75-94a7725e8589` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-2559fe60-91ac-417c-8256-029ec5a9e943` |
| 5 | `GET /v1/conversations/{id}` | 503 | 30 | `qa-7e0905b8-6307-4ed2-a3e1-e14661877f49` |
| 6 | `POST /v1/auth/token` | 200 | 33 | `qa-85e19805-2801-4905-9d4d-7e6b77ee0425` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-42f89f82-56a8-430b-ba6f-99bf33d9b9c3` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-fe64377b-f031-457d-9be3-f6d0135c0e01` |
| 9 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-57dcb328-e94a-448a-83a0-47040b56349a` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-cd5d00f0-0a2d-4940-b3ea-7bc4caed03d5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3d32191b-29bd-4f65-b578-fb93ba073488

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d32191b-29bd-4f65-b578-fb93ba073488
Content-Type: application/json

--- request body ---
{"handle":"qa-322f663fd271","displayName":"QA 322f663fd271","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d32191b-29bd-4f65-b578-fb93ba073488
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 445
RateLimit-Reset: 7
Location: /v1/accounts/qa-322f663fd271
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dea17972-7ea9-437f-84af-a81826510ad6","handle":"qa-322f663fd271","displayName":"QA 322f663fd271","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.418318825Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a9e8e7e4-9f60-49b3-8b65-33f9d5653a7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9e8e7e4-9f60-49b3-8b65-33f9d5653a7f
Content-Type: application/json

--- request body ---
{"handle":"qa-fb8de7c28086","displayName":"QA fb8de7c28086","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-a9e8e7e4-9f60-49b3-8b65-33f9d5653a7f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 437
RateLimit-Reset: 7
Location: /v1/accounts/qa-fb8de7c28086
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0b343efc-5b6f-4135-92d1-d178800aa9b6","handle":"qa-fb8de7c28086","displayName":"QA fb8de7c28086","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.489772055Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-30cc65cc-3b1e-490a-8a75-94a7725e8589

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30cc65cc-3b1e-490a-8a75-94a7725e8589
Content-Type: application/json

--- request body ---
{"handle":"qa-322f663fd271","password":"****"}

--- response: 200 in 48 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-30cc65cc-3b1e-490a-8a75-94a7725e8589
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 426
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dea17972-7ea9-437f-84af-a81826510ad6"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2559fe60-91ac-417c-8256-029ec5a9e943

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2559fe60-91ac-417c-8256-029ec5a9e943
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-fb8de7c28086","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-2559fe60-91ac-417c-8256-029ec5a9e943
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
Location: /v1/conversations/cnv_2eb688dc-e457-40dc-bdd2-3d079ff9a94e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2eb688dc-e457-40dc-bdd2-3d079ff9a94e","subject":"Error contract","status":"open","region":"eu","participants":["qa-322f663fd271","qa-fb8de7c28086"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:04.597236719Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_2eb688dc-e457-40dc-bdd2-3d079ff9a94e
correlation: qa-7e0905b8-6307-4ed2-a3e1-e14661877f49

--- request headers ---
Accept: application/json
X-Fault-Key: bd877b1b-b91b-4e00-ad54-451884656f07
X-Fault: unavailable-once
X-Correlation-Id: qa-7e0905b8-6307-4ed2-a3e1-e14661877f49
Content-Type: application/json

--- response: 503 in 30 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7e0905b8-6307-4ed2-a3e1-e14661877f49
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 302

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_2eb688dc-e457-40dc-bdd2-3d079ff9a94e","correlationId":"qa-7e0905b8-6307-4ed2-a3e1-e14661877f49"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-85e19805-2801-4905-9d4d-7e6b77ee0425

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85e19805-2801-4905-9d4d-7e6b77ee0425
Content-Type: application/json

--- request body ---
{"handle":"qa-fb8de7c28086","password":"****"}

--- response: 200 in 33 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-85e19805-2801-4905-9d4d-7e6b77ee0425
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 408
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0b343efc-5b6f-4135-92d1-d178800aa9b6"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-42f89f82-56a8-430b-ba6f-99bf33d9b9c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42f89f82-56a8-430b-ba6f-99bf33d9b9c3
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-42f89f82-56a8-430b-ba6f-99bf33d9b9c3
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
correlation: qa-fe64377b-f031-457d-9be3-f6d0135c0e01

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe64377b-f031-457d-9be3-f6d0135c0e01
Content-Type: application/json

--- request body ---
{"handle":"qa-fb8de7c28086","password":"****"}

--- response: 401 in 19 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fe64377b-f031-457d-9be3-f6d0135c0e01
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 401
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fe64377b-f031-457d-9be3-f6d0135c0e01"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-57dcb328-e94a-448a-83a0-47040b56349a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57dcb328-e94a-448a-83a0-47040b56349a
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-57dcb328-e94a-448a-83a0-47040b56349a
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
correlation: qa-cd5d00f0-0a2d-4940-b3ea-7bc4caed03d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd5d00f0-0a2d-4940-b3ea-7bc4caed03d5
Content-Type: application/json

--- request body ---
{"handle":"qa-322f663fd271","password":"****"}

--- response: 401 in 15 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cd5d00f0-0a2d-4940-b3ea-7bc4caed03d5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 395
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cd5d00f0-0a2d-4940-b3ea-7bc4caed03d5"}
```
