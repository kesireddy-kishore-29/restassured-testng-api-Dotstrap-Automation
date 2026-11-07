# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[9]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-87befab9-6f61-4c3b-878f-6c1177343e05` |
| 2 | `POST /v1/accounts` | 201 | 21 | `qa-68f251dc-b3fb-4e67-974a-32b50eaaf665` |
| 3 | `POST /v1/auth/token` | 200 | 15 | `qa-5a55c0a1-d1b9-4315-b655-096511bd4717` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-28892611-0b77-4cca-a7e3-f9cab50e268b` |
| 5 | `GET /v1/conversations/{id}/messages` | 503 | 29 | `qa-4b56308b-177c-41e3-8ac0-7429fec4f6bb` |
| 6 | `POST /v1/auth/token` | 200 | 33 | `qa-003dd0c4-c3d3-4a98-9967-2afbf4899081` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-1b38ae27-8c38-4fe9-b845-cb853d9de411` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-d10c4f58-d490-4ce1-af65-e8fccbb0916a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-181d7a67-e538-4018-b03d-35160d0b499c` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-b1edb2ff-2736-4a46-927d-0aab4b0b7d0b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-87befab9-6f61-4c3b-878f-6c1177343e05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87befab9-6f61-4c3b-878f-6c1177343e05
Content-Type: application/json

--- request body ---
{"handle":"qa-ebc30f23c2b2","displayName":"QA ebc30f23c2b2","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-87befab9-6f61-4c3b-878f-6c1177343e05
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 437
RateLimit-Reset: 9
Location: /v1/accounts/qa-ebc30f23c2b2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_43a1b1d6-34ec-48dd-9457-443af6e8ddad","handle":"qa-ebc30f23c2b2","displayName":"QA ebc30f23c2b2","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.747454202Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-68f251dc-b3fb-4e67-974a-32b50eaaf665

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68f251dc-b3fb-4e67-974a-32b50eaaf665
Content-Type: application/json

--- request body ---
{"handle":"qa-9b27590dddd9","displayName":"QA 9b27590dddd9","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-68f251dc-b3fb-4e67-974a-32b50eaaf665
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 429
RateLimit-Reset: 9
Location: /v1/accounts/qa-9b27590dddd9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6dc1878e-4582-47f2-9914-9e831ed56c6c","handle":"qa-9b27590dddd9","displayName":"QA 9b27590dddd9","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.769925244Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5a55c0a1-d1b9-4315-b655-096511bd4717

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a55c0a1-d1b9-4315-b655-096511bd4717
Content-Type: application/json

--- request body ---
{"handle":"qa-ebc30f23c2b2","password":"****"}

--- response: 200 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a55c0a1-d1b9-4315-b655-096511bd4717
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 423
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_43a1b1d6-34ec-48dd-9457-443af6e8ddad"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-28892611-0b77-4cca-a7e3-f9cab50e268b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28892611-0b77-4cca-a7e3-f9cab50e268b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9b27590dddd9","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-28892611-0b77-4cca-a7e3-f9cab50e268b
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
Location: /v1/conversations/cnv_8cb5dded-8429-4d0b-b723-0284941ba6e5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_8cb5dded-8429-4d0b-b723-0284941ba6e5","subject":"Error contract","status":"open","region":"eu","participants":["qa-ebc30f23c2b2","qa-9b27590dddd9"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:32.824544246Z"}
```

## 5. GET /v1/conversations/{id}/messages

```text
#5 GET http://localhost:7070/v1/conversations/cnv_8cb5dded-8429-4d0b-b723-0284941ba6e5/messages
correlation: qa-4b56308b-177c-41e3-8ac0-7429fec4f6bb

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 51770743-b80f-4b31-a311-8c5948003dd8
X-Correlation-Id: qa-4b56308b-177c-41e3-8ac0-7429fec4f6bb
Content-Type: application/json

--- response: 503 in 29 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4b56308b-177c-41e3-8ac0-7429fec4f6bb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_8cb5dded-8429-4d0b-b723-0284941ba6e5/messages","correlationId":"qa-4b56308b-177c-41e3-8ac0-7429fec4f6bb"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-003dd0c4-c3d3-4a98-9967-2afbf4899081

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-003dd0c4-c3d3-4a98-9967-2afbf4899081
Content-Type: application/json

--- request body ---
{"handle":"qa-9b27590dddd9","password":"****"}

--- response: 200 in 33 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-003dd0c4-c3d3-4a98-9967-2afbf4899081
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 403
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6dc1878e-4582-47f2-9914-9e831ed56c6c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1b38ae27-8c38-4fe9-b845-cb853d9de411

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b38ae27-8c38-4fe9-b845-cb853d9de411
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1b38ae27-8c38-4fe9-b845-cb853d9de411
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
correlation: qa-d10c4f58-d490-4ce1-af65-e8fccbb0916a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d10c4f58-d490-4ce1-af65-e8fccbb0916a
Content-Type: application/json

--- request body ---
{"handle":"qa-9b27590dddd9","password":"****"}

--- response: 401 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d10c4f58-d490-4ce1-af65-e8fccbb0916a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 393
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d10c4f58-d490-4ce1-af65-e8fccbb0916a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-181d7a67-e538-4018-b03d-35160d0b499c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-181d7a67-e538-4018-b03d-35160d0b499c
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-181d7a67-e538-4018-b03d-35160d0b499c
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
correlation: qa-b1edb2ff-2736-4a46-927d-0aab4b0b7d0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1edb2ff-2736-4a46-927d-0aab4b0b7d0b
Content-Type: application/json

--- request body ---
{"handle":"qa-ebc30f23c2b2","password":"****"}

--- response: 401 in 13 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b1edb2ff-2736-4a46-927d-0aab4b0b7d0b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 387
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b1edb2ff-2736-4a46-927d-0aab4b0b7d0b"}
```
