# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[0]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 15 | `qa-08c9e4cb-950f-4401-b41f-f0a6e4e803e8` |
| 2 | `POST /v1/accounts` | 201 | 11 | `qa-1154ec55-e762-47ef-92b1-b7b190682093` |
| 3 | `POST /v1/accounts` | 201 | 28 | `qa-783b0a32-9440-47d7-b05f-3078d9a757f6` |
| 4 | `POST /v1/auth/token` | 200 | 28 | `qa-1143ee94-b2b0-4863-a0fa-d178bafdd8a3` |
| 5 | `POST /v1/conversations` | 201 | 10 | `qa-786a007b-a790-4217-8716-72ab622ee995` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-26d0f1db-c75e-4fd2-ba95-dfc253f1098c` |
| 7 | `GET /v1/conversations/{id}` | 403 | 18 | `qa-dadb24e3-7569-46d5-be89-2374a222fedf` |
| 8 | `DELETE /v1/accounts/me` | 204 | 39 | `qa-76f0b562-af82-408c-b14d-dd3e743c6554` |
| 9 | `POST /v1/auth/token` | 401 | 16 | `qa-7323f69d-01f5-409f-a54a-600b8c81191e` |
| 10 | `POST /v1/auth/token` | 200 | 41 | `qa-00926ee9-8480-4964-a7a2-1895893eec47` |
| 11 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-a987c027-a545-40d6-bb1e-7661d7f36a6f` |
| 12 | `POST /v1/auth/token` | 401 | 44 | `qa-16ad0bfa-125f-41f0-b130-819cc7a19598` |
| 13 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-45939aeb-6f4b-4228-a4bc-a6a55bb34b8d` |
| 14 | `POST /v1/auth/token` | 401 | 22 | `qa-eddbd1de-2d9c-4f13-9068-fcc5a7976265` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-08c9e4cb-950f-4401-b41f-f0a6e4e803e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08c9e4cb-950f-4401-b41f-f0a6e4e803e8
Content-Type: application/json

--- request body ---
{"handle":"qa-5619bde8e577","displayName":"QA 5619bde8e577","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-08c9e4cb-950f-4401-b41f-f0a6e4e803e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 546
RateLimit-Reset: 9
Location: /v1/accounts/qa-5619bde8e577
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d7dedf4-1360-4343-9631-88f2499ed1a3","handle":"qa-5619bde8e577","displayName":"QA 5619bde8e577","region":"eu","role":"user","createdAt":"2026-10-26T07:54:46.412593640Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1154ec55-e762-47ef-92b1-b7b190682093

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1154ec55-e762-47ef-92b1-b7b190682093
Content-Type: application/json

--- request body ---
{"handle":"qa-eedad75c0347","displayName":"QA eedad75c0347","password":"****","region":"eu"}

--- response: 201 in 11 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-1154ec55-e762-47ef-92b1-b7b190682093
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 542
RateLimit-Reset: 9
Location: /v1/accounts/qa-eedad75c0347
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4430fea2-0489-4171-b38d-4a0a4918e369","handle":"qa-eedad75c0347","displayName":"QA eedad75c0347","region":"eu","role":"user","createdAt":"2026-10-26T07:54:46.427983063Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-783b0a32-9440-47d7-b05f-3078d9a757f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-783b0a32-9440-47d7-b05f-3078d9a757f6
Content-Type: application/json

--- request body ---
{"handle":"qa-4101b7a2ce27","displayName":"QA 4101b7a2ce27","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-783b0a32-9440-47d7-b05f-3078d9a757f6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 539
RateLimit-Reset: 9
Location: /v1/accounts/qa-4101b7a2ce27
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e8c40b87-e26e-4da3-8ce3-2934f73d132b","handle":"qa-4101b7a2ce27","displayName":"QA 4101b7a2ce27","region":"eu","role":"user","createdAt":"2026-10-26T07:54:46.471016375Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-1143ee94-b2b0-4863-a0fa-d178bafdd8a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1143ee94-b2b0-4863-a0fa-d178bafdd8a3
Content-Type: application/json

--- request body ---
{"handle":"qa-5619bde8e577","password":"****"}

--- response: 200 in 28 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-1143ee94-b2b0-4863-a0fa-d178bafdd8a3
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5d7dedf4-1360-4343-9631-88f2499ed1a3"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-786a007b-a790-4217-8716-72ab622ee995

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-786a007b-a790-4217-8716-72ab622ee995
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-eedad75c0347","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-786a007b-a790-4217-8716-72ab622ee995
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
Location: /v1/conversations/cnv_997116f0-6191-4324-8a13-dbc17b030fb3
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_997116f0-6191-4324-8a13-dbc17b030fb3","subject":"Error contract","status":"open","region":"eu","participants":["qa-5619bde8e577","qa-eedad75c0347"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:46.542922825Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-26d0f1db-c75e-4fd2-ba95-dfc253f1098c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26d0f1db-c75e-4fd2-ba95-dfc253f1098c
Content-Type: application/json

--- request body ---
{"handle":"qa-4101b7a2ce27","password":"****"}

--- response: 200 in 26 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-26d0f1db-c75e-4fd2-ba95-dfc253f1098c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 529
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e8c40b87-e26e-4da3-8ce3-2934f73d132b"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_997116f0-6191-4324-8a13-dbc17b030fb3
correlation: qa-dadb24e3-7569-46d5-be89-2374a222fedf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dadb24e3-7569-46d5-be89-2374a222fedf
Content-Type: application/json

--- response: 403 in 18 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dadb24e3-7569-46d5-be89-2374a222fedf
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
Content-Length: 285

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_997116f0-6191-4324-8a13-dbc17b030fb3","correlationId":"qa-dadb24e3-7569-46d5-be89-2374a222fedf"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-76f0b562-af82-408c-b14d-dd3e743c6554

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76f0b562-af82-408c-b14d-dd3e743c6554
Content-Type: application/json

--- response: 204 in 39 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-76f0b562-af82-408c-b14d-dd3e743c6554
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
correlation: qa-7323f69d-01f5-409f-a54a-600b8c81191e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7323f69d-01f5-409f-a54a-600b8c81191e
Content-Type: application/json

--- request body ---
{"handle":"qa-4101b7a2ce27","password":"****"}

--- response: 401 in 16 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7323f69d-01f5-409f-a54a-600b8c81191e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 510
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7323f69d-01f5-409f-a54a-600b8c81191e"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-00926ee9-8480-4964-a7a2-1895893eec47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00926ee9-8480-4964-a7a2-1895893eec47
Content-Type: application/json

--- request body ---
{"handle":"qa-eedad75c0347","password":"****"}

--- response: 200 in 41 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-00926ee9-8480-4964-a7a2-1895893eec47
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4430fea2-0489-4171-b38d-4a0a4918e369"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a987c027-a545-40d6-bb1e-7661d7f36a6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a987c027-a545-40d6-bb1e-7661d7f36a6f
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a987c027-a545-40d6-bb1e-7661d7f36a6f
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
correlation: qa-16ad0bfa-125f-41f0-b130-819cc7a19598

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16ad0bfa-125f-41f0-b130-819cc7a19598
Content-Type: application/json

--- request body ---
{"handle":"qa-eedad75c0347","password":"****"}

--- response: 401 in 44 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-16ad0bfa-125f-41f0-b130-819cc7a19598
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 487
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-16ad0bfa-125f-41f0-b130-819cc7a19598"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-45939aeb-6f4b-4228-a4bc-a6a55bb34b8d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45939aeb-6f4b-4228-a4bc-a6a55bb34b8d
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-45939aeb-6f4b-4228-a4bc-a6a55bb34b8d
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-eddbd1de-2d9c-4f13-9068-fcc5a7976265

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eddbd1de-2d9c-4f13-9068-fcc5a7976265
Content-Type: application/json

--- request body ---
{"handle":"qa-5619bde8e577","password":"****"}

--- response: 401 in 22 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eddbd1de-2d9c-4f13-9068-fcc5a7976265
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 470
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-eddbd1de-2d9c-4f13-9068-fcc5a7976265"}
```
