# Transcript: Every operation in the OpenAPI document answers as documented (checked per response)

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#everyOperationConformsToTheOpenApiDocument` |
| Features | FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 23 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 8 | `qa-c9453205-242c-4e2c-98ec-83e381ad2a67` |
| 2 | `POST /v1/accounts` | 201 | 11 | `qa-5df10b90-a443-4ab2-97ee-33809fd0668a` |
| 3 | `GET /health` | 200 | 7 | `qa-0de94695-11f1-49d6-9d92-b6ba04f4438d` |
| 4 | `POST /v1/auth/token` | 200 | 10 | `qa-95676d21-ba96-4b0d-9948-8604e6a44634` |
| 5 | `GET /v1/accounts/me` | 200 | 8 | `qa-f3ee3040-1921-45ec-ab01-3ab434da1822` |
| 6 | `PATCH /v1/accounts/me` | 200 | 9 | `qa-734279c1-6b60-49ba-b25a-cf95158af69e` |
| 7 | `GET /v1/accounts/{handle}` | 200 | 7 | `qa-5156d7cf-ee9c-4ba6-ac55-696a331d5fce` |
| 8 | `POST /v1/conversations` | 201 | 12 | `qa-72edb41c-41b6-438d-9174-cdabfbcadf0d` |
| 9 | `GET /v1/conversations` | 200 | 7 | `qa-39037a7a-b45c-4964-8ff9-0533d4978b30` |
| 10 | `POST /v1/auth/token` | 200 | 9 | `qa-26f9f10d-5f85-4938-ac78-4c949117a21a` |
| 11 | `GET /v1/conversations/{id}` | 200 | 6 | `qa-2c88c7a4-11df-41a1-8b3c-aff0e8239d3f` |
| 12 | `GET /v1/conversations/{id}/messages` | 200 | 9 | `qa-907e0253-3ca9-4f5d-9b58-36c748cfced0` |
| 13 | `POST /v1/conversations/{id}/messages` | 201 | 8 | `qa-46a53b34-c224-4e6b-97c0-ecc4a8cc98b3` |
| 14 | `POST /v1/conversations/{id}/read` | 200 | 5 | `qa-dcd5faf0-563b-4113-903f-461e998feeb8` |
| 15 | `POST /v1/conversations/{id}/close` | 200 | 6 | `qa-801b3390-7db1-47d0-8cf6-6ce0a64e63c5` |
| 16 | `GET /v1/credits/balance` | 200 | 7 | `qa-f4385ba6-2b43-4667-b2a2-2fcd20bef188` |
| 17 | `GET /v1/credits/ledger` | 200 | 10 | `qa-f5a9c0b7-59f1-4a69-ac3b-00f2b9819e8a` |
| 18 | `POST /v1/credits/purchases` | 201 | 9 | `qa-d2254a84-b5bb-4a2b-b7b2-1b3af58a1a08` |
| 19 | `GET /v1/admin/stats` | 403 | 8 | `qa-b2aa2f7b-76e9-4aa0-8c6f-09423909b667` |
| 20 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-4f78ab49-2840-4db9-9562-161b59eb7401` |
| 21 | `POST /v1/auth/token` | 401 | 4 | `qa-fee1941c-9fd7-423c-896d-d752bbb2eee3` |
| 22 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-f81cfa37-8065-4ee5-8946-effe00a640cb` |
| 23 | `POST /v1/auth/token` | 401 | 4 | `qa-ae254999-0851-4dde-96db-22d3cbeb6514` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c9453205-242c-4e2c-98ec-83e381ad2a67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9453205-242c-4e2c-98ec-83e381ad2a67
Content-Type: application/json

--- request body ---
{"handle":"qa-c99df2056965","displayName":"QA c99df2056965","password":"****","region":"eu"}

--- response: 201 in 8 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-c9453205-242c-4e2c-98ec-83e381ad2a67
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 280
RateLimit-Reset: 7
Location: /v1/accounts/qa-c99df2056965
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f4fbf599-aaf2-42ae-a122-63e8839f34fb","handle":"qa-c99df2056965","displayName":"QA c99df2056965","region":"eu","role":"user","createdAt":"2026-11-02T09:38:38.230998991Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5df10b90-a443-4ab2-97ee-33809fd0668a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5df10b90-a443-4ab2-97ee-33809fd0668a
Content-Type: application/json

--- request body ---
{"handle":"qa-088d6386b1c9","displayName":"QA 088d6386b1c9","password":"****","region":"us"}

--- response: 201 in 11 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-5df10b90-a443-4ab2-97ee-33809fd0668a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 279
RateLimit-Reset: 7
Location: /v1/accounts/qa-088d6386b1c9
X-Served-Region: us
Content-Length: 181

{"id":"acc_f2699376-2e7e-4c8f-83c3-0df100e39087","handle":"qa-088d6386b1c9","displayName":"QA 088d6386b1c9","region":"us","role":"user","createdAt":"2026-11-02T09:38:38.249231820Z"}
```

## 3. GET /health

```text
#3 GET http://localhost:7070/health
correlation: qa-0de94695-11f1-49d6-9d92-b6ba04f4438d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0de94695-11f1-49d6-9d92-b6ba04f4438d
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-0de94695-11f1-49d6-9d92-b6ba04f4438d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 95

{"status":"UP","version":"1.0.0","region":"eu","regions":["in","eu","us"],"faultsEnabled":true}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-95676d21-ba96-4b0d-9948-8604e6a44634

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95676d21-ba96-4b0d-9948-8604e6a44634
Content-Type: application/json

--- request body ---
{"handle":"qa-c99df2056965","password":"****"}

--- response: 200 in 10 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-95676d21-ba96-4b0d-9948-8604e6a44634
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 278
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f4fbf599-aaf2-42ae-a122-63e8839f34fb"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-f3ee3040-1921-45ec-ab01-3ab434da1822

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3ee3040-1921-45ec-ab01-3ab434da1822
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-f3ee3040-1921-45ec-ab01-3ab434da1822
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
Content-Length: 181

{"id":"acc_f4fbf599-aaf2-42ae-a122-63e8839f34fb","handle":"qa-c99df2056965","displayName":"QA c99df2056965","region":"eu","role":"user","createdAt":"2026-11-02T09:38:38.230998991Z"}
```

## 6. PATCH /v1/accounts/me

```text
#6 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-734279c1-6b60-49ba-b25a-cf95158af69e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-734279c1-6b60-49ba-b25a-cf95158af69e
Content-Type: application/json

--- request body ---
{"displayName":"Ava Contract"}

--- response: 200 in 9 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-734279c1-6b60-49ba-b25a-cf95158af69e
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
Content-Length: 178

{"id":"acc_f4fbf599-aaf2-42ae-a122-63e8839f34fb","handle":"qa-c99df2056965","displayName":"Ava Contract","region":"eu","role":"user","createdAt":"2026-11-02T09:38:38.230998991Z"}
```

## 7. GET /v1/accounts/{handle}

```text
#7 GET http://localhost:7070/v1/accounts/qa-088d6386b1c9
correlation: qa-5156d7cf-ee9c-4ba6-ac55-696a331d5fce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5156d7cf-ee9c-4ba6-ac55-696a331d5fce
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-5156d7cf-ee9c-4ba6-ac55-696a331d5fce
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
Content-Length: 74

{"handle":"qa-088d6386b1c9","displayName":"QA 088d6386b1c9","region":"us"}
```

## 8. POST /v1/conversations

```text
#8 POST http://localhost:7070/v1/conversations
correlation: qa-72edb41c-41b6-438d-9174-cdabfbcadf0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72edb41c-41b6-438d-9174-cdabfbcadf0d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-088d6386b1c9","subject":"OpenAPI journey","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-72edb41c-41b6-438d-9174-cdabfbcadf0d
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
Location: /v1/conversations/cnv_b5becd9e-7fad-4bd0-b3ba-00950c4e4686
X-Data-Region: us
Content-Length: 238

{"id":"cnv_b5becd9e-7fad-4bd0-b3ba-00950c4e4686","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-c99df2056965","qa-088d6386b1c9"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:38.320511713Z"}
```

## 9. GET /v1/conversations

```text
#9 GET http://localhost:7070/v1/conversations
correlation: qa-39037a7a-b45c-4964-8ff9-0533d4978b30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39037a7a-b45c-4964-8ff9-0533d4978b30
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-39037a7a-b45c-4964-8ff9-0533d4978b30
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
Content-Length: 260

{"items":[{"id":"cnv_b5becd9e-7fad-4bd0-b3ba-00950c4e4686","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-c99df2056965","qa-088d6386b1c9"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:38.320511713Z"}],"total":1}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-26f9f10d-5f85-4938-ac78-4c949117a21a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26f9f10d-5f85-4938-ac78-4c949117a21a
Content-Type: application/json

--- request body ---
{"handle":"qa-088d6386b1c9","password":"****"}

--- response: 200 in 9 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-26f9f10d-5f85-4938-ac78-4c949117a21a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 275
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f2699376-2e7e-4c8f-83c3-0df100e39087"}
```

## 11. GET /v1/conversations/{id}

```text
#11 GET http://localhost:7070/v1/conversations/cnv_b5becd9e-7fad-4bd0-b3ba-00950c4e4686
correlation: qa-2c88c7a4-11df-41a1-8b3c-aff0e8239d3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c88c7a4-11df-41a1-8b3c-aff0e8239d3f
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c88c7a4-11df-41a1-8b3c-aff0e8239d3f
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
X-Served-Region: us
X-Data-Region: us
Content-Length: 238

{"id":"cnv_b5becd9e-7fad-4bd0-b3ba-00950c4e4686","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-c99df2056965","qa-088d6386b1c9"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-02T09:38:38.320511713Z"}
```

## 12. GET /v1/conversations/{id}/messages

```text
#12 GET http://localhost:7070/v1/conversations/cnv_b5becd9e-7fad-4bd0-b3ba-00950c4e4686/messages
correlation: qa-907e0253-3ca9-4f5d-9b58-36c748cfced0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-907e0253-3ca9-4f5d-9b58-36c748cfced0
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-907e0253-3ca9-4f5d-9b58-36c748cfced0
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
X-Served-Region: us
Content-Length: 215

{"items":[{"id":"msg_321b7be3-0d16-46dc-9fe5-a922195fba51","conversationId":"cnv_b5becd9e-7fad-4bd0-b3ba-00950c4e4686","sender":"qa-c99df2056965","body":"Hi","createdAt":"2026-11-02T09:38:38.320516240Z"}],"total":1}
```

## 13. POST /v1/conversations/{id}/messages

```text
#13 POST http://localhost:7070/v1/conversations/cnv_b5becd9e-7fad-4bd0-b3ba-00950c4e4686/messages
correlation: qa-46a53b34-c224-4e6b-97c0-ecc4a8cc98b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46a53b34-c224-4e6b-97c0-ecc4a8cc98b3
Content-Type: application/json

--- request body ---
{"body":"Reply"}

--- response: 201 in 8 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-46a53b34-c224-4e6b-97c0-ecc4a8cc98b3
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
X-Served-Region: us
Content-Length: 196

{"id":"msg_9d44d125-cffd-442e-93b4-33000254c1e2","conversationId":"cnv_b5becd9e-7fad-4bd0-b3ba-00950c4e4686","sender":"qa-088d6386b1c9","body":"Reply","createdAt":"2026-11-02T09:38:38.396166422Z"}
```

## 14. POST /v1/conversations/{id}/read

```text
#14 POST http://localhost:7070/v1/conversations/cnv_b5becd9e-7fad-4bd0-b3ba-00950c4e4686/read
correlation: qa-dcd5faf0-563b-4113-903f-461e998feeb8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dcd5faf0-563b-4113-903f-461e998feeb8
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-dcd5faf0-563b-4113-903f-461e998feeb8
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
Content-Length: 77

{"conversationId":"cnv_b5becd9e-7fad-4bd0-b3ba-00950c4e4686","unreadCount":0}
```

## 15. POST /v1/conversations/{id}/close

```text
#15 POST http://localhost:7070/v1/conversations/cnv_b5becd9e-7fad-4bd0-b3ba-00950c4e4686/close
correlation: qa-801b3390-7db1-47d0-8cf6-6ce0a64e63c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-801b3390-7db1-47d0-8cf6-6ce0a64e63c5
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-801b3390-7db1-47d0-8cf6-6ce0a64e63c5
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
Content-Length: 284

{"id":"cnv_b5becd9e-7fad-4bd0-b3ba-00950c4e4686","subject":"OpenAPI journey","status":"closed","region":"us","participants":["qa-c99df2056965","qa-088d6386b1c9"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-02T09:38:38.320511713Z","closedAt":"2026-11-02T09:38:38.419333974Z"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-f4385ba6-2b43-4667-b2a2-2fcd20bef188

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4385ba6-2b43-4667-b2a2-2fcd20bef188
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-f4385ba6-2b43-4667-b2a2-2fcd20bef188
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
Content-Length: 89

{"balance":4,"currency":"credits","accountId":"acc_f4fbf599-aaf2-42ae-a122-63e8839f34fb"}
```

## 17. GET /v1/credits/ledger

```text
#17 GET http://localhost:7070/v1/credits/ledger
correlation: qa-f5a9c0b7-59f1-4a69-ac3b-00f2b9819e8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5a9c0b7-59f1-4a69-ac3b-00f2b9819e8a
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5a9c0b7-59f1-4a69-ac3b-00f2b9819e8a
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
Content-Length: 393

{"items":[{"id":"led_2f22a537-4086-4576-bdef-6d1adc8e6996","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-02T09:38:38.231005340Z"},{"id":"led_319b244a-2516-4d89-9162-4f474576e4ff","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_b5becd9e-7fad-4bd0-b3ba-00950c4e4686","createdAt":"2026-11-02T09:38:38.320504632Z"}],"total":2,"balance":4}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-d2254a84-b5bb-4a2b-b7b2-1b3af58a1a08

--- request headers ---
Accept: application/json
Idempotency-Key: qa-497992aa4bda4e36b77c43a0e70d1931
X-Correlation-Id: qa-d2254a84-b5bb-4a2b-b7b2-1b3af58a1a08
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 9 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-d2254a84-b5bb-4a2b-b7b2-1b3af58a1a08
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/credits/purchases/pur_7217a0b6-6fb2-460d-8ba6-7c9e5d74365f
Content-Length: 144

{"id":"pur_7217a0b6-6fb2-460d-8ba6-7c9e5d74365f","packId":"pack-50","credits":50,"balanceAfter":54,"createdAt":"2026-11-02T09:38:38.459525223Z"}
```

## 19. GET /v1/admin/stats

```text
#19 GET http://localhost:7070/v1/admin/stats
correlation: qa-b2aa2f7b-76e9-4aa0-8c6f-09423909b667

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2aa2f7b-76e9-4aa0-8c6f-09423909b667
Content-Type: application/json

--- response: 403 in 8 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b2aa2f7b-76e9-4aa0-8c6f-09423909b667
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 215

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-b2aa2f7b-76e9-4aa0-8c6f-09423909b667"}
```

## 20. DELETE /v1/accounts/me

```text
#20 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4f78ab49-2840-4db9-9562-161b59eb7401

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f78ab49-2840-4db9-9562-161b59eb7401
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4f78ab49-2840-4db9-9562-161b59eb7401
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
X-Served-Region: us
```

## 21. POST /v1/auth/token

```text
#21 POST http://localhost:7070/v1/auth/token
correlation: qa-fee1941c-9fd7-423c-896d-d752bbb2eee3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fee1941c-9fd7-423c-896d-d752bbb2eee3
Content-Type: application/json

--- request body ---
{"handle":"qa-088d6386b1c9","password":"****"}

--- response: 401 in 4 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fee1941c-9fd7-423c-896d-d752bbb2eee3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 272
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fee1941c-9fd7-423c-896d-d752bbb2eee3"}
```

## 22. DELETE /v1/accounts/me

```text
#22 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f81cfa37-8065-4ee5-8946-effe00a640cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f81cfa37-8065-4ee5-8946-effe00a640cb
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f81cfa37-8065-4ee5-8946-effe00a640cb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 48
RateLimit-Reset: 10
X-Served-Region: eu
```

## 23. POST /v1/auth/token

```text
#23 POST http://localhost:7070/v1/auth/token
correlation: qa-ae254999-0851-4dde-96db-22d3cbeb6514

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae254999-0851-4dde-96db-22d3cbeb6514
Content-Type: application/json

--- request body ---
{"handle":"qa-c99df2056965","password":"****"}

--- response: 401 in 4 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ae254999-0851-4dde-96db-22d3cbeb6514
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 271
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ae254999-0851-4dde-96db-22d3cbeb6514"}
```
