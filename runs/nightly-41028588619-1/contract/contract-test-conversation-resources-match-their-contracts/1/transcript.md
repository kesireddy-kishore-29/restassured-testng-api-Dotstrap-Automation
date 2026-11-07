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
| 1 | `POST /v1/accounts` | 201 | 15 | `qa-2cfa7d8c-bad6-4643-a62f-fba54a2cb848` |
| 2 | `POST /v1/accounts` | 201 | 13 | `qa-7e07d1e7-971a-42ff-857f-9b19d4d95f31` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-04a74635-84d0-4a39-bcfe-d065c55fb5a5` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-3d561c15-bc8e-48e3-a9c8-222a923a8109` |
| 5 | `GET /v1/conversations` | 200 | 20 | `qa-8369af79-90b3-4d53-8a36-9acf6b31e72a` |
| 6 | `GET /v1/conversations/{id}` | 200 | 6 | `qa-d02a4272-c095-40b5-ac44-529fcd76d56f` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 12 | `qa-b28814f2-58a0-4beb-9a6c-611a42d84ad1` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 17 | `qa-e86f1f55-6750-494f-9ab3-35fa265fb67a` |
| 9 | `POST /v1/auth/token` | 200 | 15 | `qa-ce9d042a-f313-449d-ad07-a46af3922368` |
| 10 | `POST /v1/conversations/{id}/read` | 200 | 18 | `qa-8afc8436-8901-44d0-8390-c9c54cb09374` |
| 11 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-77aa94dc-488c-4f57-b419-50b9d32b5694` |
| 12 | `POST /v1/auth/token` | 401 | 9 | `qa-d15039c9-c886-45b1-bdee-28948a36c98a` |
| 13 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-d0c40450-6199-42be-8d1f-b4ddbd008c1d` |
| 14 | `POST /v1/auth/token` | 401 | 8 | `qa-a0fcfedc-1ad3-4460-91c6-88b0c47eb1dc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2cfa7d8c-bad6-4643-a62f-fba54a2cb848

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2cfa7d8c-bad6-4643-a62f-fba54a2cb848
Content-Type: application/json

--- request body ---
{"handle":"qa-c4f6ae476e97","displayName":"QA c4f6ae476e97","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-2cfa7d8c-bad6-4643-a62f-fba54a2cb848
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 292
RateLimit-Reset: 5
Location: /v1/accounts/qa-c4f6ae476e97
X-Served-Region: eu
Content-Length: 181

{"id":"acc_059f9ff4-5593-41b5-bd74-88891137fe6e","handle":"qa-c4f6ae476e97","displayName":"QA c4f6ae476e97","region":"eu","role":"user","createdAt":"2026-10-30T08:46:06.375824663Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7e07d1e7-971a-42ff-857f-9b19d4d95f31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e07d1e7-971a-42ff-857f-9b19d4d95f31
Content-Type: application/json

--- request body ---
{"handle":"qa-b41b60471ca2","displayName":"QA b41b60471ca2","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e07d1e7-971a-42ff-857f-9b19d4d95f31
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 289
RateLimit-Reset: 5
Location: /v1/accounts/qa-b41b60471ca2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_81150d96-189a-456f-85f0-a64a5cf66eb1","handle":"qa-b41b60471ca2","displayName":"QA b41b60471ca2","region":"eu","role":"user","createdAt":"2026-10-30T08:46:06.392328323Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-04a74635-84d0-4a39-bcfe-d065c55fb5a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04a74635-84d0-4a39-bcfe-d065c55fb5a5
Content-Type: application/json

--- request body ---
{"handle":"qa-c4f6ae476e97","password":"****"}

--- response: 200 in 20 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-04a74635-84d0-4a39-bcfe-d065c55fb5a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 286
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_059f9ff4-5593-41b5-bd74-88891137fe6e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3d561c15-bc8e-48e3-a9c8-222a923a8109

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d561c15-bc8e-48e3-a9c8-222a923a8109
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b41b60471ca2","subject":"Contract check","message":"Hello"}

--- response: 201 in 10 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d561c15-bc8e-48e3-a9c8-222a923a8109
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
Location: /v1/conversations/cnv_2bb7d55a-f283-4992-8760-6826420592b0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2bb7d55a-f283-4992-8760-6826420592b0","subject":"Contract check","status":"open","region":"eu","participants":["qa-c4f6ae476e97","qa-b41b60471ca2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:06.443753034Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-8369af79-90b3-4d53-8a36-9acf6b31e72a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8369af79-90b3-4d53-8a36-9acf6b31e72a
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-8369af79-90b3-4d53-8a36-9acf6b31e72a
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

{"items":[{"id":"cnv_2bb7d55a-f283-4992-8760-6826420592b0","subject":"Contract check","status":"open","region":"eu","participants":["qa-c4f6ae476e97","qa-b41b60471ca2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:06.443753034Z"}],"total":1}
```

## 6. GET /v1/conversations/{id}

```text
#6 GET http://localhost:7070/v1/conversations/cnv_2bb7d55a-f283-4992-8760-6826420592b0
correlation: qa-d02a4272-c095-40b5-ac44-529fcd76d56f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d02a4272-c095-40b5-ac44-529fcd76d56f
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-d02a4272-c095-40b5-ac44-529fcd76d56f
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

{"id":"cnv_2bb7d55a-f283-4992-8760-6826420592b0","subject":"Contract check","status":"open","region":"eu","participants":["qa-c4f6ae476e97","qa-b41b60471ca2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:06.443753034Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_2bb7d55a-f283-4992-8760-6826420592b0/messages
correlation: qa-b28814f2-58a0-4beb-9a6c-611a42d84ad1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b28814f2-58a0-4beb-9a6c-611a42d84ad1
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 12 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-b28814f2-58a0-4beb-9a6c-611a42d84ad1
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

{"id":"msg_aabddb81-a855-4834-9f0a-47f793c3ff63","conversationId":"cnv_2bb7d55a-f283-4992-8760-6826420592b0","sender":"qa-c4f6ae476e97","body":"Second","createdAt":"2026-10-30T08:46:06.539399832Z"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_2bb7d55a-f283-4992-8760-6826420592b0/messages
correlation: qa-e86f1f55-6750-494f-9ab3-35fa265fb67a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e86f1f55-6750-494f-9ab3-35fa265fb67a
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-e86f1f55-6750-494f-9ab3-35fa265fb67a
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

{"items":[{"id":"msg_a3e20ab8-cf90-45af-952d-60fb70254e96","conversationId":"cnv_2bb7d55a-f283-4992-8760-6826420592b0","sender":"qa-c4f6ae476e97","body":"Hello","createdAt":"2026-10-30T08:46:06.443759123Z"},{"id":"msg_aabddb81-a855-4834-9f0a-47f793c3ff63","conversationId":"cnv_2bb7d55a-f283-4992-8760-6826420592b0","sender":"qa-c4f6ae476e97","body":"Second","createdAt":"2026-10-30T08:46:06.539399832Z"}],"total":2}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-ce9d042a-f313-449d-ad07-a46af3922368

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce9d042a-f313-449d-ad07-a46af3922368
Content-Type: application/json

--- request body ---
{"handle":"qa-b41b60471ca2","password":"****"}

--- response: 200 in 15 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce9d042a-f313-449d-ad07-a46af3922368
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 278
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_81150d96-189a-456f-85f0-a64a5cf66eb1"}
```

## 10. POST /v1/conversations/{id}/read

```text
#10 POST http://localhost:7070/v1/conversations/cnv_2bb7d55a-f283-4992-8760-6826420592b0/read
correlation: qa-8afc8436-8901-44d0-8390-c9c54cb09374

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8afc8436-8901-44d0-8390-c9c54cb09374
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-8afc8436-8901-44d0-8390-c9c54cb09374
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

{"conversationId":"cnv_2bb7d55a-f283-4992-8760-6826420592b0","unreadCount":0}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-77aa94dc-488c-4f57-b419-50b9d32b5694

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77aa94dc-488c-4f57-b419-50b9d32b5694
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-77aa94dc-488c-4f57-b419-50b9d32b5694
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
correlation: qa-d15039c9-c886-45b1-bdee-28948a36c98a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d15039c9-c886-45b1-bdee-28948a36c98a
Content-Type: application/json

--- request body ---
{"handle":"qa-b41b60471ca2","password":"****"}

--- response: 401 in 9 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d15039c9-c886-45b1-bdee-28948a36c98a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 275
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d15039c9-c886-45b1-bdee-28948a36c98a"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d0c40450-6199-42be-8d1f-b4ddbd008c1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0c40450-6199-42be-8d1f-b4ddbd008c1d
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d0c40450-6199-42be-8d1f-b4ddbd008c1d
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
correlation: qa-a0fcfedc-1ad3-4460-91c6-88b0c47eb1dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0fcfedc-1ad3-4460-91c6-88b0c47eb1dc
Content-Type: application/json

--- request body ---
{"handle":"qa-c4f6ae476e97","password":"****"}

--- response: 401 in 8 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a0fcfedc-1ad3-4460-91c6-88b0c47eb1dc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 274
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a0fcfedc-1ad3-4460-91c6-88b0c47eb1dc"}
```
