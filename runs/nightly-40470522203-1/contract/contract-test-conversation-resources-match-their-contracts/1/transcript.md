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
| 1 | `POST /v1/accounts` | 201 | 440 | `qa-87574a0c-5781-4f81-9019-d9a63a017fbe` |
| 2 | `POST /v1/accounts` | 201 | 51 | `qa-83acacd1-3db2-4367-88e6-a2c5f3b808e6` |
| 3 | `POST /v1/auth/token` | 200 | 38 | `qa-cecb4e0c-2189-43af-be9f-d6f692a86bff` |
| 4 | `POST /v1/conversations` | 201 | 69 | `qa-968030f1-7a30-483e-abfa-ceddd8e2fe5b` |
| 5 | `GET /v1/conversations` | 200 | 16 | `qa-5d1d2f5a-2220-4caa-8d6d-df19ddc34274` |
| 6 | `GET /v1/conversations/{id}` | 200 | 16 | `qa-587cd5c9-5c22-4e8a-bc8f-c08ceeb63d2d` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 34 | `qa-bb72b531-3044-4bd7-b5a8-b3755ec9ab05` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 15 | `qa-94df8364-f3be-4163-858e-3c7eabc8320e` |
| 9 | `POST /v1/auth/token` | 200 | 19 | `qa-dc7a86e3-d582-4062-92ac-cac5f895e085` |
| 10 | `POST /v1/conversations/{id}/read` | 200 | 20 | `qa-b927c90b-bc2f-46d1-81a6-29b8a29279d0` |
| 11 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-76947389-d0b5-4b08-ab98-9320b8365a68` |
| 12 | `POST /v1/auth/token` | 401 | 10 | `qa-d74642b2-0b29-43d1-b9a2-b6789bf3cf6a` |
| 13 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-c1429433-255f-4e0a-8d93-1000d4217320` |
| 14 | `POST /v1/auth/token` | 401 | 21 | `qa-765ae4ec-f5e1-4b3d-8a41-d2cc27856f3e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-87574a0c-5781-4f81-9019-d9a63a017fbe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87574a0c-5781-4f81-9019-d9a63a017fbe
Content-Type: application/json

--- request body ---
{"handle":"qa-7334ddfdba8f","displayName":"QA 7334ddfdba8f","password":"****","region":"eu"}

--- response: 201 in 440 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-87574a0c-5781-4f81-9019-d9a63a017fbe
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
Location: /v1/accounts/qa-7334ddfdba8f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_af7a9060-23bd-4d3b-a0ad-9444b2cf827a","handle":"qa-7334ddfdba8f","displayName":"QA 7334ddfdba8f","region":"eu","role":"user","createdAt":"2026-10-27T08:00:31.277086390Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-83acacd1-3db2-4367-88e6-a2c5f3b808e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83acacd1-3db2-4367-88e6-a2c5f3b808e6
Content-Type: application/json

--- request body ---
{"handle":"qa-ed4cc989edd4","displayName":"QA ed4cc989edd4","password":"****","region":"eu"}

--- response: 201 in 51 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-83acacd1-3db2-4367-88e6-a2c5f3b808e6
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
Location: /v1/accounts/qa-ed4cc989edd4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3e99b58-07ee-4176-97d2-61c8e3f29897","handle":"qa-ed4cc989edd4","displayName":"QA ed4cc989edd4","region":"eu","role":"user","createdAt":"2026-10-27T08:00:31.718506862Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-cecb4e0c-2189-43af-be9f-d6f692a86bff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cecb4e0c-2189-43af-be9f-d6f692a86bff
Content-Type: application/json

--- request body ---
{"handle":"qa-7334ddfdba8f","password":"****"}

--- response: 200 in 38 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-cecb4e0c-2189-43af-be9f-d6f692a86bff
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_af7a9060-23bd-4d3b-a0ad-9444b2cf827a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-968030f1-7a30-483e-abfa-ceddd8e2fe5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-968030f1-7a30-483e-abfa-ceddd8e2fe5b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ed4cc989edd4","subject":"Contract check","message":"Hello"}

--- response: 201 in 69 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-968030f1-7a30-483e-abfa-ceddd8e2fe5b
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
Location: /v1/conversations/cnv_a4a80d15-f09b-46f8-bc03-cbf4ae3a8ad5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a4a80d15-f09b-46f8-bc03-cbf4ae3a8ad5","subject":"Contract check","status":"open","region":"eu","participants":["qa-7334ddfdba8f","qa-ed4cc989edd4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:31.880987456Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-5d1d2f5a-2220-4caa-8d6d-df19ddc34274

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d1d2f5a-2220-4caa-8d6d-df19ddc34274
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d1d2f5a-2220-4caa-8d6d-df19ddc34274
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

{"items":[{"id":"cnv_a4a80d15-f09b-46f8-bc03-cbf4ae3a8ad5","subject":"Contract check","status":"open","region":"eu","participants":["qa-7334ddfdba8f","qa-ed4cc989edd4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:31.880987456Z"}],"total":1}
```

## 6. GET /v1/conversations/{id}

```text
#6 GET http://localhost:7070/v1/conversations/cnv_a4a80d15-f09b-46f8-bc03-cbf4ae3a8ad5
correlation: qa-587cd5c9-5c22-4e8a-bc8f-c08ceeb63d2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-587cd5c9-5c22-4e8a-bc8f-c08ceeb63d2d
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-587cd5c9-5c22-4e8a-bc8f-c08ceeb63d2d
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

{"id":"cnv_a4a80d15-f09b-46f8-bc03-cbf4ae3a8ad5","subject":"Contract check","status":"open","region":"eu","participants":["qa-7334ddfdba8f","qa-ed4cc989edd4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:31.880987456Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_a4a80d15-f09b-46f8-bc03-cbf4ae3a8ad5/messages
correlation: qa-bb72b531-3044-4bd7-b5a8-b3755ec9ab05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb72b531-3044-4bd7-b5a8-b3755ec9ab05
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 34 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb72b531-3044-4bd7-b5a8-b3755ec9ab05
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

{"id":"msg_a895a4ac-6ed0-4a88-9e9e-24c9342c2230","conversationId":"cnv_a4a80d15-f09b-46f8-bc03-cbf4ae3a8ad5","sender":"qa-7334ddfdba8f","body":"Second","createdAt":"2026-10-27T08:00:32.084044220Z"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_a4a80d15-f09b-46f8-bc03-cbf4ae3a8ad5/messages
correlation: qa-94df8364-f3be-4163-858e-3c7eabc8320e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94df8364-f3be-4163-858e-3c7eabc8320e
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-94df8364-f3be-4163-858e-3c7eabc8320e
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

{"items":[{"id":"msg_f6414199-b4d7-4446-9d1c-e8bc1c4760f2","conversationId":"cnv_a4a80d15-f09b-46f8-bc03-cbf4ae3a8ad5","sender":"qa-7334ddfdba8f","body":"Hello","createdAt":"2026-10-27T08:00:31.881240107Z"},{"id":"msg_a895a4ac-6ed0-4a88-9e9e-24c9342c2230","conversationId":"cnv_a4a80d15-f09b-46f8-bc03-cbf4ae3a8ad5","sender":"qa-7334ddfdba8f","body":"Second","createdAt":"2026-10-27T08:00:32.084044220Z"}],"total":2}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-dc7a86e3-d582-4062-92ac-cac5f895e085

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc7a86e3-d582-4062-92ac-cac5f895e085
Content-Type: application/json

--- request body ---
{"handle":"qa-ed4cc989edd4","password":"****"}

--- response: 200 in 19 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc7a86e3-d582-4062-92ac-cac5f895e085
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a3e99b58-07ee-4176-97d2-61c8e3f29897"}
```

## 10. POST /v1/conversations/{id}/read

```text
#10 POST http://localhost:7070/v1/conversations/cnv_a4a80d15-f09b-46f8-bc03-cbf4ae3a8ad5/read
correlation: qa-b927c90b-bc2f-46d1-81a6-29b8a29279d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b927c90b-bc2f-46d1-81a6-29b8a29279d0
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-b927c90b-bc2f-46d1-81a6-29b8a29279d0
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

{"conversationId":"cnv_a4a80d15-f09b-46f8-bc03-cbf4ae3a8ad5","unreadCount":0}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-76947389-d0b5-4b08-ab98-9320b8365a68

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76947389-d0b5-4b08-ab98-9320b8365a68
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-76947389-d0b5-4b08-ab98-9320b8365a68
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
correlation: qa-d74642b2-0b29-43d1-b9a2-b6789bf3cf6a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d74642b2-0b29-43d1-b9a2-b6789bf3cf6a
Content-Type: application/json

--- request body ---
{"handle":"qa-ed4cc989edd4","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d74642b2-0b29-43d1-b9a2-b6789bf3cf6a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d74642b2-0b29-43d1-b9a2-b6789bf3cf6a"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c1429433-255f-4e0a-8d93-1000d4217320

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1429433-255f-4e0a-8d93-1000d4217320
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c1429433-255f-4e0a-8d93-1000d4217320
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
correlation: qa-765ae4ec-f5e1-4b3d-8a41-d2cc27856f3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-765ae4ec-f5e1-4b3d-8a41-d2cc27856f3e
Content-Type: application/json

--- request body ---
{"handle":"qa-7334ddfdba8f","password":"****"}

--- response: 401 in 21 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-765ae4ec-f5e1-4b3d-8a41-d2cc27856f3e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-765ae4ec-f5e1-4b3d-8a41-d2cc27856f3e"}
```
