# Transcript: Two people start a conversation and exchange messages

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.ConversationsTest#twoPeopleExchangeMessages` |
| Features | FEAT-CONV-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 358 | `qa-91537784-a9b0-49a0-b740-974a313e6fd2` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-88f9927f-0434-42c9-b1c0-5f46febe8e41` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-16e39915-0e93-4959-9569-f4a80a229a3a` |
| 4 | `POST /v1/conversations` | 201 | 84 | `qa-23fa9df2-199e-4fc3-812a-8e49fdd96ec9` |
| 5 | `POST /v1/auth/token` | 200 | 30 | `qa-0291bd82-6c8c-453a-bdfc-3e83d8c1fe28` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 20 | `qa-eefa2867-2d7e-4f6f-871c-4dd38c37b9fe` |
| 7 | `GET /v1/conversations/{id}/messages` | 200 | 19 | `qa-d625906e-be60-4e20-9968-597e138d059d` |
| 8 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-17c7ce4c-43d5-4e6f-a073-062e8e363092` |
| 9 | `POST /v1/auth/token` | 401 | 14 | `qa-a19fbb04-0487-44b3-9498-53a3a48c87a4` |
| 10 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-05078f2e-3d7e-49c0-8bd0-6857377cac35` |
| 11 | `POST /v1/auth/token` | 401 | 8 | `qa-683c3140-d914-4f92-b31b-0f2185e86d39` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-91537784-a9b0-49a0-b740-974a313e6fd2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91537784-a9b0-49a0-b740-974a313e6fd2
Content-Type: application/json

--- request body ---
{"handle":"qa-ac7524875129","displayName":"QA ac7524875129","password":"****","region":"eu"}

--- response: 201 in 358 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-91537784-a9b0-49a0-b740-974a313e6fd2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 11
Location: /v1/accounts/qa-ac7524875129
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cd58ba33-52cd-4640-b03e-381092cba017","handle":"qa-ac7524875129","displayName":"QA ac7524875129","region":"eu","role":"user","createdAt":"2026-11-15T09:36:08.910794676Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-88f9927f-0434-42c9-b1c0-5f46febe8e41

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88f9927f-0434-42c9-b1c0-5f46febe8e41
Content-Type: application/json

--- request body ---
{"handle":"qa-6692dc248815","displayName":"QA 6692dc248815","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-88f9927f-0434-42c9-b1c0-5f46febe8e41
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
Location: /v1/accounts/qa-6692dc248815
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b28b9889-73cc-49b1-a6f8-1da0f11f7230","handle":"qa-6692dc248815","displayName":"QA 6692dc248815","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.363442694Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-16e39915-0e93-4959-9569-f4a80a229a3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16e39915-0e93-4959-9569-f4a80a229a3a
Content-Type: application/json

--- request body ---
{"handle":"qa-ac7524875129","password":"****"}

--- response: 200 in 34 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-16e39915-0e93-4959-9569-f4a80a229a3a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cd58ba33-52cd-4640-b03e-381092cba017"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-23fa9df2-199e-4fc3-812a-8e49fdd96ec9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23fa9df2-199e-4fc3-812a-8e49fdd96ec9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6692dc248815","subject":"Lunch?","message":"Free on Friday?"}

--- response: 201 in 84 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-23fa9df2-199e-4fc3-812a-8e49fdd96ec9
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
Location: /v1/conversations/cnv_e793f577-609f-451e-b9e7-1ea6f326dd2c
X-Data-Region: eu
Content-Length: 229

{"id":"cnv_e793f577-609f-451e-b9e7-1ea6f326dd2c","subject":"Lunch?","status":"open","region":"eu","participants":["qa-ac7524875129","qa-6692dc248815"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:09.517699457Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-0291bd82-6c8c-453a-bdfc-3e83d8c1fe28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0291bd82-6c8c-453a-bdfc-3e83d8c1fe28
Content-Type: application/json

--- request body ---
{"handle":"qa-6692dc248815","password":"****"}

--- response: 200 in 30 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-0291bd82-6c8c-453a-bdfc-3e83d8c1fe28
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b28b9889-73cc-49b1-a6f8-1da0f11f7230"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_e793f577-609f-451e-b9e7-1ea6f326dd2c/messages
correlation: qa-eefa2867-2d7e-4f6f-871c-4dd38c37b9fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eefa2867-2d7e-4f6f-871c-4dd38c37b9fe
Content-Type: application/json

--- request body ---
{"body":"Friday works"}

--- response: 201 in 20 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-eefa2867-2d7e-4f6f-871c-4dd38c37b9fe
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
Content-Length: 203

{"id":"msg_9cae3050-b3e3-48ae-9a05-cace1bef1196","conversationId":"cnv_e793f577-609f-451e-b9e7-1ea6f326dd2c","sender":"qa-6692dc248815","body":"Friday works","createdAt":"2026-11-15T09:36:09.656197796Z"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_e793f577-609f-451e-b9e7-1ea6f326dd2c/messages
correlation: qa-d625906e-be60-4e20-9968-597e138d059d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d625906e-be60-4e20-9968-597e138d059d
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-d625906e-be60-4e20-9968-597e138d059d
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
Content-Length: 432

{"items":[{"id":"msg_fc8be48b-503e-4e89-b1a8-777db412cf8b","conversationId":"cnv_e793f577-609f-451e-b9e7-1ea6f326dd2c","sender":"qa-ac7524875129","body":"Free on Friday?","createdAt":"2026-11-15T09:36:09.517983257Z"},{"id":"msg_9cae3050-b3e3-48ae-9a05-cace1bef1196","conversationId":"cnv_e793f577-609f-451e-b9e7-1ea6f326dd2c","sender":"qa-6692dc248815","body":"Friday works","createdAt":"2026-11-15T09:36:09.656197796Z"}],"total":2}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-17c7ce4c-43d5-4e6f-a073-062e8e363092

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17c7ce4c-43d5-4e6f-a073-062e8e363092
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-17c7ce4c-43d5-4e6f-a073-062e8e363092
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
correlation: qa-a19fbb04-0487-44b3-9498-53a3a48c87a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a19fbb04-0487-44b3-9498-53a3a48c87a4
Content-Type: application/json

--- request body ---
{"handle":"qa-6692dc248815","password":"****"}

--- response: 401 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a19fbb04-0487-44b3-9498-53a3a48c87a4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a19fbb04-0487-44b3-9498-53a3a48c87a4"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-05078f2e-3d7e-49c0-8bd0-6857377cac35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05078f2e-3d7e-49c0-8bd0-6857377cac35
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-05078f2e-3d7e-49c0-8bd0-6857377cac35
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

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-683c3140-d914-4f92-b31b-0f2185e86d39

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-683c3140-d914-4f92-b31b-0f2185e86d39
Content-Type: application/json

--- request body ---
{"handle":"qa-ac7524875129","password":"****"}

--- response: 401 in 8 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-683c3140-d914-4f92-b31b-0f2185e86d39
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-683c3140-d914-4f92-b31b-0f2185e86d39"}
```
