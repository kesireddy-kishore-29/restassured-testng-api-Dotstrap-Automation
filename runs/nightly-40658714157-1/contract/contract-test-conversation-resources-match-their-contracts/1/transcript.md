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
| 1 | `POST /v1/accounts` | 201 | 240 | `qa-cbd77db1-4664-471a-9a02-7ec11666c19d` |
| 2 | `POST /v1/accounts` | 201 | 19 | `qa-142bcd4d-f57e-4f12-adfe-c37e4e49c7f9` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-c7d2bb47-4e4f-40fe-8159-e51d146928b5` |
| 4 | `POST /v1/conversations` | 201 | 47 | `qa-ce759b28-70b8-4a1c-9cb6-d7473e83faa5` |
| 5 | `GET /v1/conversations` | 200 | 24 | `qa-27f21b7e-1c54-4d42-a0ea-18e0b8ff746d` |
| 6 | `GET /v1/conversations/{id}` | 200 | 26 | `qa-5c38d609-dc5f-40cd-93f0-c73956d2fe27` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 16 | `qa-a0f21fd4-c22f-4098-958b-467af37ee9c5` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 13 | `qa-a6cf579e-cf77-4a03-8ef4-b7e7a8ae58f7` |
| 9 | `POST /v1/auth/token` | 200 | 8 | `qa-e98ff0d1-3258-425c-b6c1-410a5d719097` |
| 10 | `POST /v1/conversations/{id}/read` | 200 | 11 | `qa-a9d31eff-a2ad-4e5f-81da-8f8818a2c92b` |
| 11 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-23b819c3-7431-486f-9f8e-cbc9a78cf6f1` |
| 12 | `POST /v1/auth/token` | 401 | 5 | `qa-6de5f0e3-c779-48d2-823a-4114fc6d535b` |
| 13 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-b6fadd98-b05e-4e49-a5a6-ccd68c5cdfd4` |
| 14 | `POST /v1/auth/token` | 401 | 13 | `qa-707a1afe-0a7b-4716-a058-f8f829d66dd5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cbd77db1-4664-471a-9a02-7ec11666c19d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cbd77db1-4664-471a-9a02-7ec11666c19d
Content-Type: application/json

--- request body ---
{"handle":"qa-eeb0e1a04547","displayName":"QA eeb0e1a04547","password":"****","region":"eu"}

--- response: 201 in 240 ms ---
Date: Wed, 28 Oct 2026 08:42:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-cbd77db1-4664-471a-9a02-7ec11666c19d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-eeb0e1a04547
X-Served-Region: eu
Content-Length: 181

{"id":"acc_86f1a61b-3ca7-4039-be32-b23d50e8ecef","handle":"qa-eeb0e1a04547","displayName":"QA eeb0e1a04547","region":"eu","role":"user","createdAt":"2026-10-28T08:42:50.645433853Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-142bcd4d-f57e-4f12-adfe-c37e4e49c7f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-142bcd4d-f57e-4f12-adfe-c37e4e49c7f9
Content-Type: application/json

--- request body ---
{"handle":"qa-d4357633d596","displayName":"QA d4357633d596","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Wed, 28 Oct 2026 08:42:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-142bcd4d-f57e-4f12-adfe-c37e4e49c7f9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Location: /v1/accounts/qa-d4357633d596
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fa4c0140-46fb-40c6-b112-366a3b1a45af","handle":"qa-d4357633d596","displayName":"QA d4357633d596","region":"eu","role":"user","createdAt":"2026-10-28T08:42:50.930884226Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c7d2bb47-4e4f-40fe-8159-e51d146928b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7d2bb47-4e4f-40fe-8159-e51d146928b5
Content-Type: application/json

--- request body ---
{"handle":"qa-eeb0e1a04547","password":"****"}

--- response: 200 in 21 ms ---
Date: Wed, 28 Oct 2026 08:42:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-c7d2bb47-4e4f-40fe-8159-e51d146928b5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_86f1a61b-3ca7-4039-be32-b23d50e8ecef"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ce759b28-70b8-4a1c-9cb6-d7473e83faa5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce759b28-70b8-4a1c-9cb6-d7473e83faa5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d4357633d596","subject":"Contract check","message":"Hello"}

--- response: 201 in 47 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce759b28-70b8-4a1c-9cb6-d7473e83faa5
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
Location: /v1/conversations/cnv_71edf6b4-2bba-4451-991b-e819985b4528
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_71edf6b4-2bba-4451-991b-e819985b4528","subject":"Contract check","status":"open","region":"eu","participants":["qa-eeb0e1a04547","qa-d4357633d596"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:51.029188881Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-27f21b7e-1c54-4d42-a0ea-18e0b8ff746d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27f21b7e-1c54-4d42-a0ea-18e0b8ff746d
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-27f21b7e-1c54-4d42-a0ea-18e0b8ff746d
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

{"items":[{"id":"cnv_71edf6b4-2bba-4451-991b-e819985b4528","subject":"Contract check","status":"open","region":"eu","participants":["qa-eeb0e1a04547","qa-d4357633d596"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:51.029188881Z"}],"total":1}
```

## 6. GET /v1/conversations/{id}

```text
#6 GET http://localhost:7070/v1/conversations/cnv_71edf6b4-2bba-4451-991b-e819985b4528
correlation: qa-5c38d609-dc5f-40cd-93f0-c73956d2fe27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c38d609-dc5f-40cd-93f0-c73956d2fe27
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c38d609-dc5f-40cd-93f0-c73956d2fe27
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

{"id":"cnv_71edf6b4-2bba-4451-991b-e819985b4528","subject":"Contract check","status":"open","region":"eu","participants":["qa-eeb0e1a04547","qa-d4357633d596"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:51.029188881Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_71edf6b4-2bba-4451-991b-e819985b4528/messages
correlation: qa-a0f21fd4-c22f-4098-958b-467af37ee9c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0f21fd4-c22f-4098-958b-467af37ee9c5
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 16 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0f21fd4-c22f-4098-958b-467af37ee9c5
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

{"id":"msg_812d0cc4-61b0-46d9-b39d-a15a01c3a6fd","conversationId":"cnv_71edf6b4-2bba-4451-991b-e819985b4528","sender":"qa-eeb0e1a04547","body":"Second","createdAt":"2026-10-28T08:42:51.164768895Z"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_71edf6b4-2bba-4451-991b-e819985b4528/messages
correlation: qa-a6cf579e-cf77-4a03-8ef4-b7e7a8ae58f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6cf579e-cf77-4a03-8ef4-b7e7a8ae58f7
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6cf579e-cf77-4a03-8ef4-b7e7a8ae58f7
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

{"items":[{"id":"msg_3e036cc4-33f7-4cf0-863f-ae5372983421","conversationId":"cnv_71edf6b4-2bba-4451-991b-e819985b4528","sender":"qa-eeb0e1a04547","body":"Hello","createdAt":"2026-10-28T08:42:51.029344876Z"},{"id":"msg_812d0cc4-61b0-46d9-b39d-a15a01c3a6fd","conversationId":"cnv_71edf6b4-2bba-4451-991b-e819985b4528","sender":"qa-eeb0e1a04547","body":"Second","createdAt":"2026-10-28T08:42:51.164768895Z"}],"total":2}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-e98ff0d1-3258-425c-b6c1-410a5d719097

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e98ff0d1-3258-425c-b6c1-410a5d719097
Content-Type: application/json

--- request body ---
{"handle":"qa-d4357633d596","password":"****"}

--- response: 200 in 8 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-e98ff0d1-3258-425c-b6c1-410a5d719097
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fa4c0140-46fb-40c6-b112-366a3b1a45af"}
```

## 10. POST /v1/conversations/{id}/read

```text
#10 POST http://localhost:7070/v1/conversations/cnv_71edf6b4-2bba-4451-991b-e819985b4528/read
correlation: qa-a9d31eff-a2ad-4e5f-81da-8f8818a2c92b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9d31eff-a2ad-4e5f-81da-8f8818a2c92b
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-a9d31eff-a2ad-4e5f-81da-8f8818a2c92b
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

{"conversationId":"cnv_71edf6b4-2bba-4451-991b-e819985b4528","unreadCount":0}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-23b819c3-7431-486f-9f8e-cbc9a78cf6f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23b819c3-7431-486f-9f8e-cbc9a78cf6f1
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-23b819c3-7431-486f-9f8e-cbc9a78cf6f1
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
correlation: qa-6de5f0e3-c779-48d2-823a-4114fc6d535b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6de5f0e3-c779-48d2-823a-4114fc6d535b
Content-Type: application/json

--- request body ---
{"handle":"qa-d4357633d596","password":"****"}

--- response: 401 in 5 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6de5f0e3-c779-48d2-823a-4114fc6d535b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6de5f0e3-c779-48d2-823a-4114fc6d535b"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b6fadd98-b05e-4e49-a5a6-ccd68c5cdfd4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6fadd98-b05e-4e49-a5a6-ccd68c5cdfd4
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b6fadd98-b05e-4e49-a5a6-ccd68c5cdfd4
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
correlation: qa-707a1afe-0a7b-4716-a058-f8f829d66dd5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-707a1afe-0a7b-4716-a058-f8f829d66dd5
Content-Type: application/json

--- request body ---
{"handle":"qa-eeb0e1a04547","password":"****"}

--- response: 401 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-707a1afe-0a7b-4716-a058-f8f829d66dd5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-707a1afe-0a7b-4716-a058-f8f829d66dd5"}
```
