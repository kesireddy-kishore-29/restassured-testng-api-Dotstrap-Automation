# Transcript: With no credits left, a message is a 402 and nothing is charged

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.CreditsNegativeTest#sendingWithNoCreditsIsA402` |
| Features | FEAT-LEDGER-02, FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 16 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-ea9a31b0-9a48-4506-94a8-b59b85af9a2e` |
| 2 | `POST /v1/accounts` | 201 | 9 | `qa-77398472-5d4b-4c26-8614-c6dddfd5e6d7` |
| 3 | `POST /v1/auth/token` | 200 | 13 | `qa-7e8f6e9c-0cc8-4436-ab18-63a5dbe3ec00` |
| 4 | `POST /v1/conversations` | 201 | 6 | `qa-090b3df8-74ad-4eaa-806e-632a795bd46c` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 13 | `qa-17d5e515-fd08-4ba2-a487-3b75a3aa4232` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 17 | `qa-4a1529fe-1261-4d3e-b9ac-2ceefe80132e` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 17 | `qa-ef64bd5a-6c60-4efc-81b9-bb4a0211119b` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 7 | `qa-66b259f1-f478-47c3-9a1b-f94e3f736b1f` |
| 9 | `GET /v1/credits/balance` | 200 | 5 | `qa-a0c4e5dc-a427-4e88-8e51-09b967949a20` |
| 10 | `POST /v1/conversations/{id}/messages` | 402 | 10 | `qa-25d21345-b75a-45b7-ad92-90c0b6a6323b` |
| 11 | `GET /v1/credits/ledger` | 200 | 11 | `qa-797b1911-9548-4417-83e9-99c972305437` |
| 12 | `POST /v1/auth/token` | 200 | 8 | `qa-4b655095-888b-47d6-a959-972f9e314bc8` |
| 13 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-83dae9ac-a338-40c2-b76c-851cff6f98ca` |
| 14 | `POST /v1/auth/token` | 401 | 4 | `qa-25198990-e8b0-45a2-a6d1-dd7e92482448` |
| 15 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-23f38f7c-a403-455b-98e9-05e534a6af1a` |
| 16 | `POST /v1/auth/token` | 401 | 5 | `qa-3c12d786-051d-4a03-8bc6-a47b27f2630e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ea9a31b0-9a48-4506-94a8-b59b85af9a2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea9a31b0-9a48-4506-94a8-b59b85af9a2e
Content-Type: application/json

--- request body ---
{"handle":"qa-623d61d208c0","displayName":"QA 623d61d208c0","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-ea9a31b0-9a48-4506-94a8-b59b85af9a2e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Location: /v1/accounts/qa-623d61d208c0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_692813cf-39bd-4cb2-9da3-a723fed5fb8e","handle":"qa-623d61d208c0","displayName":"QA 623d61d208c0","region":"eu","role":"user","createdAt":"2026-11-27T10:59:51.691568912Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-77398472-5d4b-4c26-8614-c6dddfd5e6d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77398472-5d4b-4c26-8614-c6dddfd5e6d7
Content-Type: application/json

--- request body ---
{"handle":"qa-dc0b14e9ca94","displayName":"QA dc0b14e9ca94","password":"****","region":"eu"}

--- response: 201 in 9 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-77398472-5d4b-4c26-8614-c6dddfd5e6d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Location: /v1/accounts/qa-dc0b14e9ca94
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9292d894-7aa3-438e-bef7-f40a3fdca670","handle":"qa-dc0b14e9ca94","displayName":"QA dc0b14e9ca94","region":"eu","role":"user","createdAt":"2026-11-27T10:59:51.712204768Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-7e8f6e9c-0cc8-4436-ab18-63a5dbe3ec00

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e8f6e9c-0cc8-4436-ab18-63a5dbe3ec00
Content-Type: application/json

--- request body ---
{"handle":"qa-623d61d208c0","password":"****"}

--- response: 200 in 13 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e8f6e9c-0cc8-4436-ab18-63a5dbe3ec00
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_692813cf-39bd-4cb2-9da3-a723fed5fb8e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-090b3df8-74ad-4eaa-806e-632a795bd46c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-090b3df8-74ad-4eaa-806e-632a795bd46c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-dc0b14e9ca94","subject":"Many messages","message":"1"}

--- response: 201 in 6 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-090b3df8-74ad-4eaa-806e-632a795bd46c
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
Location: /v1/conversations/cnv_5d0c49e3-41d9-4857-9b6c-409c6dd1ea4d
X-Data-Region: eu
Content-Length: 236

{"id":"cnv_5d0c49e3-41d9-4857-9b6c-409c6dd1ea4d","subject":"Many messages","status":"open","region":"eu","participants":["qa-623d61d208c0","qa-dc0b14e9ca94"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:51.748461519Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_5d0c49e3-41d9-4857-9b6c-409c6dd1ea4d/messages
correlation: qa-17d5e515-fd08-4ba2-a487-3b75a3aa4232

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17d5e515-fd08-4ba2-a487-3b75a3aa4232
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 13 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-17d5e515-fd08-4ba2-a487-3b75a3aa4232
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
Content-Length: 192

{"id":"msg_dd6f97c1-0020-4476-aea7-5a9d3dec0273","conversationId":"cnv_5d0c49e3-41d9-4857-9b6c-409c6dd1ea4d","sender":"qa-623d61d208c0","body":"2","createdAt":"2026-11-27T10:59:51.764377088Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_5d0c49e3-41d9-4857-9b6c-409c6dd1ea4d/messages
correlation: qa-4a1529fe-1261-4d3e-b9ac-2ceefe80132e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a1529fe-1261-4d3e-b9ac-2ceefe80132e
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 17 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-4a1529fe-1261-4d3e-b9ac-2ceefe80132e
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
Content-Length: 192

{"id":"msg_71f5dd1d-65f2-45bb-932e-583c4bee44f8","conversationId":"cnv_5d0c49e3-41d9-4857-9b6c-409c6dd1ea4d","sender":"qa-623d61d208c0","body":"3","createdAt":"2026-11-27T10:59:51.798907521Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_5d0c49e3-41d9-4857-9b6c-409c6dd1ea4d/messages
correlation: qa-ef64bd5a-6c60-4efc-81b9-bb4a0211119b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef64bd5a-6c60-4efc-81b9-bb4a0211119b
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 17 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef64bd5a-6c60-4efc-81b9-bb4a0211119b
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
Content-Length: 192

{"id":"msg_3e41aaa0-ce1f-406f-9d3b-7cca0054ac9d","conversationId":"cnv_5d0c49e3-41d9-4857-9b6c-409c6dd1ea4d","sender":"qa-623d61d208c0","body":"4","createdAt":"2026-11-27T10:59:51.836128980Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_5d0c49e3-41d9-4857-9b6c-409c6dd1ea4d/messages
correlation: qa-66b259f1-f478-47c3-9a1b-f94e3f736b1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66b259f1-f478-47c3-9a1b-f94e3f736b1f
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 7 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-66b259f1-f478-47c3-9a1b-f94e3f736b1f
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
Content-Length: 192

{"id":"msg_7ce33f28-415c-4cf0-9b91-c53f378f39fb","conversationId":"cnv_5d0c49e3-41d9-4857-9b6c-409c6dd1ea4d","sender":"qa-623d61d208c0","body":"5","createdAt":"2026-11-27T10:59:51.851728308Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-a0c4e5dc-a427-4e88-8e51-09b967949a20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0c4e5dc-a427-4e88-8e51-09b967949a20
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0c4e5dc-a427-4e88-8e51-09b967949a20
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
Content-Length: 89

{"balance":0,"currency":"credits","accountId":"acc_692813cf-39bd-4cb2-9da3-a723fed5fb8e"}
```

## 10. POST /v1/conversations/{id}/messages

```text
#10 POST http://localhost:7070/v1/conversations/cnv_5d0c49e3-41d9-4857-9b6c-409c6dd1ea4d/messages
correlation: qa-25d21345-b75a-45b7-ad92-90c0b6a6323b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25d21345-b75a-45b7-ad92-90c0b6a6323b
Content-Type: application/json

--- request body ---
{"body":"6"}

--- response: 402 in 10 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-25d21345-b75a-45b7-ad92-90c0b6a6323b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 320

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations/cnv_5d0c49e3-41d9-4857-9b6c-409c6dd1ea4d/messages","correlationId":"qa-25d21345-b75a-45b7-ad92-90c0b6a6323b"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-797b1911-9548-4417-83e9-99c972305437

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-797b1911-9548-4417-83e9-99c972305437
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-797b1911-9548-4417-83e9-99c972305437
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 1169

{"items":[{"id":"led_f0060ddf-869c-4d71-95b5-9df3c701234a","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-27T10:59:51.691580419Z"},{"id":"led_7245cfea-c746-46dc-858e-ae09145931bb","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_5d0c49e3-41d9-4857-9b6c-409c6dd1ea4d","createdAt":"2026-11-27T10:59:51.748431985Z"},{"id":"led_d5262cf7-f2a9-4e8e-9498-5df69f21d331","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_dd6f97c1-0020-4476-aea7-5a9d3dec0273","createdAt":"2026-11-27T10:59:51.764345951Z"},{"id":"led_4e1b9bfa-db52-4a28-ab88-99c537251174","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_71f5dd1d-65f2-45bb-932e-583c4bee44f8","createdAt":"2026-11-27T10:59:51.798880340Z"},{"id":"led_9d75ed1d-736d-4417-b45d-5fe509e51521","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_3e41aaa0-ce1f-406f-9d3b-7cca0054ac9d","createdAt":"2026-11-27T10:59:51.836088178Z"},{"id":"led_e946a1a9-f16e-4cd6-ab59-229a1ab57fa2","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_7ce33f28-415c-4cf0-9b91-c53f378f39fb","createdAt":"2026-11-27T10:59:51.851698493Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-4b655095-888b-47d6-a959-972f9e314bc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b655095-888b-47d6-a959-972f9e314bc8
Content-Type: application/json

--- request body ---
{"handle":"qa-dc0b14e9ca94","password":"****"}

--- response: 200 in 8 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b655095-888b-47d6-a959-972f9e314bc8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9292d894-7aa3-438e-bef7-f40a3fdca670"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-83dae9ac-a338-40c2-b76c-851cff6f98ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83dae9ac-a338-40c2-b76c-851cff6f98ca
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-83dae9ac-a338-40c2-b76c-851cff6f98ca
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-25198990-e8b0-45a2-a6d1-dd7e92482448

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25198990-e8b0-45a2-a6d1-dd7e92482448
Content-Type: application/json

--- request body ---
{"handle":"qa-dc0b14e9ca94","password":"****"}

--- response: 401 in 4 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-25198990-e8b0-45a2-a6d1-dd7e92482448
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-25198990-e8b0-45a2-a6d1-dd7e92482448"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-23f38f7c-a403-455b-98e9-05e534a6af1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23f38f7c-a403-455b-98e9-05e534a6af1a
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-23f38f7c-a403-455b-98e9-05e534a6af1a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
```

## 16. POST /v1/auth/token

```text
#16 POST http://localhost:7070/v1/auth/token
correlation: qa-3c12d786-051d-4a03-8bc6-a47b27f2630e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c12d786-051d-4a03-8bc6-a47b27f2630e
Content-Type: application/json

--- request body ---
{"handle":"qa-623d61d208c0","password":"****"}

--- response: 401 in 5 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3c12d786-051d-4a03-8bc6-a47b27f2630e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3c12d786-051d-4a03-8bc6-a47b27f2630e"}
```
