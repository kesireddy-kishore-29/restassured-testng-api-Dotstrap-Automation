# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[1]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-01d05b23-2efe-42fd-a9ce-abc30bb9dbd5` |
| 2 | `POST /v1/accounts` | 201 | 11 | `qa-7dc7acd4-d808-42c2-84c2-f4f9eed952eb` |
| 3 | `POST /v1/accounts` | 201 | 45 | `qa-22eb3bf0-485d-4bc6-bb84-89832025f049` |
| 4 | `POST /v1/auth/token` | 200 | 44 | `qa-7f493527-a9c1-4621-9d4c-4876130341b6` |
| 5 | `POST /v1/conversations` | 201 | 14 | `qa-12cab2cf-8970-4fb1-afd6-911198232471` |
| 6 | `POST /v1/auth/token` | 200 | 25 | `qa-0c34b6dc-1d46-407f-a16c-f8fb014bdb35` |
| 7 | `GET /v1/conversations/{id}/messages` | 403 | 18 | `qa-1f4f953b-6283-45d8-97f6-01e11701dee4` |
| 8 | `DELETE /v1/accounts/me` | 204 | 41 | `qa-35b2201e-3fb1-4369-813d-be68e31ad8ab` |
| 9 | `POST /v1/auth/token` | 401 | 32 | `qa-8ad396d6-9a92-4dd6-8927-cd89f248eea8` |
| 10 | `POST /v1/auth/token` | 200 | 81 | `qa-33c761cb-e8ae-4d7b-8761-e9ce0c54e651` |
| 11 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-91ec4289-d709-4b5a-935f-2881a27110b3` |
| 12 | `POST /v1/auth/token` | 401 | 47 | `qa-a0a12f64-9e32-40e6-8143-8febc63764a7` |
| 13 | `DELETE /v1/accounts/me` | 204 | 48 | `qa-04cac6f9-8897-4f8f-9442-d74d7c3eb2b9` |
| 14 | `POST /v1/auth/token` | 401 | 22 | `qa-4417b554-7b5b-4a09-a0ef-2bd6bc7868c5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-01d05b23-2efe-42fd-a9ce-abc30bb9dbd5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01d05b23-2efe-42fd-a9ce-abc30bb9dbd5
Content-Type: application/json

--- request body ---
{"handle":"qa-20b993b81fe4","displayName":"QA 20b993b81fe4","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-01d05b23-2efe-42fd-a9ce-abc30bb9dbd5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 543
RateLimit-Reset: 9
Location: /v1/accounts/qa-20b993b81fe4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_36b797f6-531b-483d-9a36-adb2734aa745","handle":"qa-20b993b81fe4","displayName":"QA 20b993b81fe4","region":"eu","role":"user","createdAt":"2026-11-20T10:10:00.720488982Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7dc7acd4-d808-42c2-84c2-f4f9eed952eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7dc7acd4-d808-42c2-84c2-f4f9eed952eb
Content-Type: application/json

--- request body ---
{"handle":"qa-a2275449cbf2","displayName":"QA a2275449cbf2","password":"****","region":"eu"}

--- response: 201 in 11 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-7dc7acd4-d808-42c2-84c2-f4f9eed952eb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 541
RateLimit-Reset: 9
Location: /v1/accounts/qa-a2275449cbf2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a96d57c0-0a8f-42dc-b4d0-00637f2ae7c5","handle":"qa-a2275449cbf2","displayName":"QA a2275449cbf2","region":"eu","role":"user","createdAt":"2026-11-20T10:10:00.743086982Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-22eb3bf0-485d-4bc6-bb84-89832025f049

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22eb3bf0-485d-4bc6-bb84-89832025f049
Content-Type: application/json

--- request body ---
{"handle":"qa-7ea6b9ea6291","displayName":"QA 7ea6b9ea6291","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-22eb3bf0-485d-4bc6-bb84-89832025f049
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 535
RateLimit-Reset: 9
Location: /v1/accounts/qa-7ea6b9ea6291
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9d185ff0-97d9-4824-8331-d2e84aad2eb3","handle":"qa-7ea6b9ea6291","displayName":"QA 7ea6b9ea6291","region":"eu","role":"user","createdAt":"2026-11-20T10:10:00.796260995Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-7f493527-a9c1-4621-9d4c-4876130341b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f493527-a9c1-4621-9d4c-4876130341b6
Content-Type: application/json

--- request body ---
{"handle":"qa-20b993b81fe4","password":"****"}

--- response: 200 in 44 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f493527-a9c1-4621-9d4c-4876130341b6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 530
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_36b797f6-531b-483d-9a36-adb2734aa745"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-12cab2cf-8970-4fb1-afd6-911198232471

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12cab2cf-8970-4fb1-afd6-911198232471
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a2275449cbf2","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-12cab2cf-8970-4fb1-afd6-911198232471
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
Location: /v1/conversations/cnv_5dac11b8-a959-43e0-9e8d-7ad5bb6c045e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5dac11b8-a959-43e0-9e8d-7ad5bb6c045e","subject":"Error contract","status":"open","region":"eu","participants":["qa-20b993b81fe4","qa-a2275449cbf2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:00.878426972Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0c34b6dc-1d46-407f-a16c-f8fb014bdb35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c34b6dc-1d46-407f-a16c-f8fb014bdb35
Content-Type: application/json

--- request body ---
{"handle":"qa-7ea6b9ea6291","password":"****"}

--- response: 200 in 25 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-0c34b6dc-1d46-407f-a16c-f8fb014bdb35
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 526
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9d185ff0-97d9-4824-8331-d2e84aad2eb3"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_5dac11b8-a959-43e0-9e8d-7ad5bb6c045e/messages
correlation: qa-1f4f953b-6283-45d8-97f6-01e11701dee4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f4f953b-6283-45d8-97f6-01e11701dee4
Content-Type: application/json

--- response: 403 in 18 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1f4f953b-6283-45d8-97f6-01e11701dee4
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_5dac11b8-a959-43e0-9e8d-7ad5bb6c045e/messages","correlationId":"qa-1f4f953b-6283-45d8-97f6-01e11701dee4"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-35b2201e-3fb1-4369-813d-be68e31ad8ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35b2201e-3fb1-4369-813d-be68e31ad8ab
Content-Type: application/json

--- response: 204 in 41 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-35b2201e-3fb1-4369-813d-be68e31ad8ab
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-8ad396d6-9a92-4dd6-8927-cd89f248eea8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ad396d6-9a92-4dd6-8927-cd89f248eea8
Content-Type: application/json

--- request body ---
{"handle":"qa-7ea6b9ea6291","password":"****"}

--- response: 401 in 32 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8ad396d6-9a92-4dd6-8927-cd89f248eea8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 512
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8ad396d6-9a92-4dd6-8927-cd89f248eea8"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-33c761cb-e8ae-4d7b-8761-e9ce0c54e651

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33c761cb-e8ae-4d7b-8761-e9ce0c54e651
Content-Type: application/json

--- request body ---
{"handle":"qa-a2275449cbf2","password":"****"}

--- response: 200 in 81 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-33c761cb-e8ae-4d7b-8761-e9ce0c54e651
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 504
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a96d57c0-0a8f-42dc-b4d0-00637f2ae7c5"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-91ec4289-d709-4b5a-935f-2881a27110b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91ec4289-d709-4b5a-935f-2881a27110b3
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-91ec4289-d709-4b5a-935f-2881a27110b3
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-a0a12f64-9e32-40e6-8143-8febc63764a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0a12f64-9e32-40e6-8143-8febc63764a7
Content-Type: application/json

--- request body ---
{"handle":"qa-a2275449cbf2","password":"****"}

--- response: 401 in 47 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a0a12f64-9e32-40e6-8143-8febc63764a7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 490
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a0a12f64-9e32-40e6-8143-8febc63764a7"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-04cac6f9-8897-4f8f-9442-d74d7c3eb2b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04cac6f9-8897-4f8f-9442-d74d7c3eb2b9
Content-Type: application/json

--- response: 204 in 48 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-04cac6f9-8897-4f8f-9442-d74d7c3eb2b9
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-4417b554-7b5b-4a09-a0ef-2bd6bc7868c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4417b554-7b5b-4a09-a0ef-2bd6bc7868c5
Content-Type: application/json

--- request body ---
{"handle":"qa-20b993b81fe4","password":"****"}

--- response: 401 in 22 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4417b554-7b5b-4a09-a0ef-2bd6bc7868c5
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4417b554-7b5b-4a09-a0ef-2bd6bc7868c5"}
```
