# Transcript: Conversation, message, page and read-state match their schemas

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#conversationResourcesMatchTheirContracts` |
| Features | FEAT-CONTRACT-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 493 | `qa-56f15a1a-6bca-4c2a-97dd-7f517e991023` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-142033ba-7a4b-4c31-a5d7-3a0f77cc6782` |
| 3 | `POST /v1/auth/token` | 200 | 53 | `qa-a6e63c28-07f5-414a-842f-e42cc13e9a87` |
| 4 | `POST /v1/conversations` | 201 | 79 | `qa-dc80a67f-d153-48c3-973c-76bd9f53c6c5` |
| 5 | `GET /v1/conversations` | 200 | 32 | `qa-a139d1ba-ab37-4940-aebd-949e5a729a09` |
| 6 | `GET /v1/conversations/{id}` | 200 | 24 | `qa-c09b69c8-ff9b-4260-9c75-7c246a50bd17` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 12 | `qa-7d1cd590-bd01-4649-9065-c3429bd11970` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 13 | `qa-886c22c2-4667-49f7-9a4c-a4ec2a109e17` |
| 9 | `POST /v1/auth/token` | 200 | 11 | `qa-c8a1c789-197e-4d34-b790-39fbce4a3c7e` |
| 10 | `POST /v1/conversations/{id}/read` | 200 | 17 | `qa-6b0ecef2-cd75-4682-b1b8-46ff3f4da88a` |
| 11 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-958cd6ef-f11d-4570-b202-16b550595eec` |
| 12 | `POST /v1/auth/token` | 401 | 5 | `qa-d23fcf2d-f393-4db3-a293-6dd953bfccfe` |
| 13 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-b33d828f-e861-44b8-af35-a00bb986f3de` |
| 14 | `POST /v1/auth/token` | 401 | 36 | `qa-9fd2d2b4-698f-4076-938c-ce8eb55de343` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-56f15a1a-6bca-4c2a-97dd-7f517e991023

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56f15a1a-6bca-4c2a-97dd-7f517e991023
Content-Type: application/json

--- request body ---
{"handle":"qa-35a45f979a6d","displayName":"QA 35a45f979a6d","password":"****","region":"eu"}

--- response: 201 in 493 ms ---
Date: Thu, 19 Nov 2026 10:29:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-56f15a1a-6bca-4c2a-97dd-7f517e991023
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-35a45f979a6d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2b06189b-81df-4d89-9849-a15a41e616db","handle":"qa-35a45f979a6d","displayName":"QA 35a45f979a6d","region":"eu","role":"user","createdAt":"2026-11-19T10:29:22.316527478Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-142033ba-7a4b-4c31-a5d7-3a0f77cc6782

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-142033ba-7a4b-4c31-a5d7-3a0f77cc6782
Content-Type: application/json

--- request body ---
{"handle":"qa-bc6e4f3c6822","displayName":"QA bc6e4f3c6822","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Thu, 19 Nov 2026 10:29:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-142033ba-7a4b-4c31-a5d7-3a0f77cc6782
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-bc6e4f3c6822
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff26e852-3f43-4a54-8209-dd847265c409","handle":"qa-bc6e4f3c6822","displayName":"QA bc6e4f3c6822","region":"eu","role":"user","createdAt":"2026-11-19T10:29:22.827569376Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a6e63c28-07f5-414a-842f-e42cc13e9a87

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6e63c28-07f5-414a-842f-e42cc13e9a87
Content-Type: application/json

--- request body ---
{"handle":"qa-35a45f979a6d","password":"****"}

--- response: 200 in 53 ms ---
Date: Thu, 19 Nov 2026 10:29:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6e63c28-07f5-414a-842f-e42cc13e9a87
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2b06189b-81df-4d89-9849-a15a41e616db"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-dc80a67f-d153-48c3-973c-76bd9f53c6c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc80a67f-d153-48c3-973c-76bd9f53c6c5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-bc6e4f3c6822","subject":"Contract check","message":"Hello"}

--- response: 201 in 79 ms ---
Date: Thu, 19 Nov 2026 10:29:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc80a67f-d153-48c3-973c-76bd9f53c6c5
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
Location: /v1/conversations/cnv_7a952625-c631-47c5-90c6-08ce19de0af0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7a952625-c631-47c5-90c6-08ce19de0af0","subject":"Contract check","status":"open","region":"eu","participants":["qa-35a45f979a6d","qa-bc6e4f3c6822"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:23.016161516Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-a139d1ba-ab37-4940-aebd-949e5a729a09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a139d1ba-ab37-4940-aebd-949e5a729a09
Content-Type: application/json

--- response: 200 in 32 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-a139d1ba-ab37-4940-aebd-949e5a729a09
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
Content-Length: 259

{"items":[{"id":"cnv_7a952625-c631-47c5-90c6-08ce19de0af0","subject":"Contract check","status":"open","region":"eu","participants":["qa-35a45f979a6d","qa-bc6e4f3c6822"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:23.016161516Z"}],"total":1}
```

## 6. GET /v1/conversations/{id}

```text
#6 GET http://localhost:7070/v1/conversations/cnv_7a952625-c631-47c5-90c6-08ce19de0af0
correlation: qa-c09b69c8-ff9b-4260-9c75-7c246a50bd17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c09b69c8-ff9b-4260-9c75-7c246a50bd17
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-c09b69c8-ff9b-4260-9c75-7c246a50bd17
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
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7a952625-c631-47c5-90c6-08ce19de0af0","subject":"Contract check","status":"open","region":"eu","participants":["qa-35a45f979a6d","qa-bc6e4f3c6822"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:23.016161516Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_7a952625-c631-47c5-90c6-08ce19de0af0/messages
correlation: qa-7d1cd590-bd01-4649-9065-c3429bd11970

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d1cd590-bd01-4649-9065-c3429bd11970
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 12 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d1cd590-bd01-4649-9065-c3429bd11970
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 197

{"id":"msg_353075a9-9642-45e6-8283-fcb57f90d7d7","conversationId":"cnv_7a952625-c631-47c5-90c6-08ce19de0af0","sender":"qa-35a45f979a6d","body":"Second","createdAt":"2026-11-19T10:29:23.184682524Z"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_7a952625-c631-47c5-90c6-08ce19de0af0/messages
correlation: qa-886c22c2-4667-49f7-9a4c-a4ec2a109e17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-886c22c2-4667-49f7-9a4c-a4ec2a109e17
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-886c22c2-4667-49f7-9a4c-a4ec2a109e17
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 416

{"items":[{"id":"msg_072d695a-3396-4fdc-8955-3fbdd6da0d56","conversationId":"cnv_7a952625-c631-47c5-90c6-08ce19de0af0","sender":"qa-35a45f979a6d","body":"Hello","createdAt":"2026-11-19T10:29:23.016462972Z"},{"id":"msg_353075a9-9642-45e6-8283-fcb57f90d7d7","conversationId":"cnv_7a952625-c631-47c5-90c6-08ce19de0af0","sender":"qa-35a45f979a6d","body":"Second","createdAt":"2026-11-19T10:29:23.184682524Z"}],"total":2}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-c8a1c789-197e-4d34-b790-39fbce4a3c7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8a1c789-197e-4d34-b790-39fbce4a3c7e
Content-Type: application/json

--- request body ---
{"handle":"qa-bc6e4f3c6822","password":"****"}

--- response: 200 in 11 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8a1c789-197e-4d34-b790-39fbce4a3c7e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ff26e852-3f43-4a54-8209-dd847265c409"}
```

## 10. POST /v1/conversations/{id}/read

```text
#10 POST http://localhost:7070/v1/conversations/cnv_7a952625-c631-47c5-90c6-08ce19de0af0/read
correlation: qa-6b0ecef2-cd75-4682-b1b8-46ff3f4da88a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b0ecef2-cd75-4682-b1b8-46ff3f4da88a
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b0ecef2-cd75-4682-b1b8-46ff3f4da88a
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
Content-Length: 77

{"conversationId":"cnv_7a952625-c631-47c5-90c6-08ce19de0af0","unreadCount":0}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-958cd6ef-f11d-4570-b202-16b550595eec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-958cd6ef-f11d-4570-b202-16b550595eec
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-958cd6ef-f11d-4570-b202-16b550595eec
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-d23fcf2d-f393-4db3-a293-6dd953bfccfe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d23fcf2d-f393-4db3-a293-6dd953bfccfe
Content-Type: application/json

--- request body ---
{"handle":"qa-bc6e4f3c6822","password":"****"}

--- response: 401 in 5 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d23fcf2d-f393-4db3-a293-6dd953bfccfe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d23fcf2d-f393-4db3-a293-6dd953bfccfe"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b33d828f-e861-44b8-af35-a00bb986f3de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b33d828f-e861-44b8-af35-a00bb986f3de
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b33d828f-e861-44b8-af35-a00bb986f3de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-9fd2d2b4-698f-4076-938c-ce8eb55de343

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9fd2d2b4-698f-4076-938c-ce8eb55de343
Content-Type: application/json

--- request body ---
{"handle":"qa-35a45f979a6d","password":"****"}

--- response: 401 in 36 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9fd2d2b4-698f-4076-938c-ce8eb55de343
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9fd2d2b4-698f-4076-938c-ce8eb55de343"}
```
