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
| 1 | `POST /v1/accounts` | 201 | 299 | `qa-43fd104c-54af-449b-8d37-ec566c9de508` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-e5c32326-095f-4644-a6a9-f6fd0bc8bb96` |
| 3 | `POST /v1/auth/token` | 200 | 15 | `qa-72092745-6ffa-4a34-8461-c7aaf28cf02f` |
| 4 | `POST /v1/conversations` | 201 | 46 | `qa-993d4902-e26e-44f8-9510-80357092e8b1` |
| 5 | `GET /v1/conversations` | 200 | 24 | `qa-50f7adc9-9dfd-45bd-bc00-95fd0219b8f5` |
| 6 | `GET /v1/conversations/{id}` | 200 | 5 | `qa-cc1f2e0f-87da-401a-b74a-088b84af4c39` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 10 | `qa-0dc4780f-5199-43fd-b8c1-736af15d53ee` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 8 | `qa-aa9be2af-3468-46c9-9bc3-60e15a3b78ec` |
| 9 | `POST /v1/auth/token` | 200 | 13 | `qa-2fa41058-3a15-461f-9239-f5ae1e9d8bef` |
| 10 | `POST /v1/conversations/{id}/read` | 200 | 11 | `qa-bb2a4cd1-7687-4e01-b400-6a014056c644` |
| 11 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-500b09b3-a6ab-4adb-8200-b73456f54ce8` |
| 12 | `POST /v1/auth/token` | 401 | 4 | `qa-ca48bb87-e939-4c94-9186-5f26592c4355` |
| 13 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-cb4ab9f7-6d9f-46d4-baf0-8b46028493df` |
| 14 | `POST /v1/auth/token` | 401 | 4 | `qa-6e6d9fbd-8f8d-4b7a-9aac-ba62c363c887` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-43fd104c-54af-449b-8d37-ec566c9de508

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43fd104c-54af-449b-8d37-ec566c9de508
Content-Type: application/json

--- request body ---
{"handle":"qa-97138adc8e5f","displayName":"QA 97138adc8e5f","password":"****","region":"eu"}

--- response: 201 in 299 ms ---
Date: Thu, 12 Nov 2026 09:56:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-43fd104c-54af-449b-8d37-ec566c9de508
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
Location: /v1/accounts/qa-97138adc8e5f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5f28d479-77b3-4ab2-89a9-e8e7a1a94731","handle":"qa-97138adc8e5f","displayName":"QA 97138adc8e5f","region":"eu","role":"user","createdAt":"2026-11-12T09:56:29.271027240Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e5c32326-095f-4644-a6a9-f6fd0bc8bb96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5c32326-095f-4644-a6a9-f6fd0bc8bb96
Content-Type: application/json

--- request body ---
{"handle":"qa-aef2c182440c","displayName":"QA aef2c182440c","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Thu, 12 Nov 2026 09:56:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5c32326-095f-4644-a6a9-f6fd0bc8bb96
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
Location: /v1/accounts/qa-aef2c182440c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6c7e0af6-9394-4611-b07d-889ba021f0b6","handle":"qa-aef2c182440c","displayName":"QA aef2c182440c","region":"eu","role":"user","createdAt":"2026-11-12T09:56:29.545316009Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-72092745-6ffa-4a34-8461-c7aaf28cf02f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72092745-6ffa-4a34-8461-c7aaf28cf02f
Content-Type: application/json

--- request body ---
{"handle":"qa-97138adc8e5f","password":"****"}

--- response: 200 in 15 ms ---
Date: Thu, 12 Nov 2026 09:56:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-72092745-6ffa-4a34-8461-c7aaf28cf02f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5f28d479-77b3-4ab2-89a9-e8e7a1a94731"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-993d4902-e26e-44f8-9510-80357092e8b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-993d4902-e26e-44f8-9510-80357092e8b1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-aef2c182440c","subject":"Contract check","message":"Hello"}

--- response: 201 in 46 ms ---
Date: Thu, 12 Nov 2026 09:56:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-993d4902-e26e-44f8-9510-80357092e8b1
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
Location: /v1/conversations/cnv_3ba75ac8-c120-4ddb-b07c-46ecce134084
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3ba75ac8-c120-4ddb-b07c-46ecce134084","subject":"Contract check","status":"open","region":"eu","participants":["qa-97138adc8e5f","qa-aef2c182440c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:29.673664403Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-50f7adc9-9dfd-45bd-bc00-95fd0219b8f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50f7adc9-9dfd-45bd-bc00-95fd0219b8f5
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Thu, 12 Nov 2026 09:56:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-50f7adc9-9dfd-45bd-bc00-95fd0219b8f5
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

{"items":[{"id":"cnv_3ba75ac8-c120-4ddb-b07c-46ecce134084","subject":"Contract check","status":"open","region":"eu","participants":["qa-97138adc8e5f","qa-aef2c182440c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:29.673664403Z"}],"total":1}
```

## 6. GET /v1/conversations/{id}

```text
#6 GET http://localhost:7070/v1/conversations/cnv_3ba75ac8-c120-4ddb-b07c-46ecce134084
correlation: qa-cc1f2e0f-87da-401a-b74a-088b84af4c39

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc1f2e0f-87da-401a-b74a-088b84af4c39
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 12 Nov 2026 09:56:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc1f2e0f-87da-401a-b74a-088b84af4c39
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

{"id":"cnv_3ba75ac8-c120-4ddb-b07c-46ecce134084","subject":"Contract check","status":"open","region":"eu","participants":["qa-97138adc8e5f","qa-aef2c182440c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:29.673664403Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_3ba75ac8-c120-4ddb-b07c-46ecce134084/messages
correlation: qa-0dc4780f-5199-43fd-b8c1-736af15d53ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0dc4780f-5199-43fd-b8c1-736af15d53ee
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 10 ms ---
Date: Thu, 12 Nov 2026 09:56:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-0dc4780f-5199-43fd-b8c1-736af15d53ee
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

{"id":"msg_48b7c790-3d26-41ca-bdf9-e046914dc465","conversationId":"cnv_3ba75ac8-c120-4ddb-b07c-46ecce134084","sender":"qa-97138adc8e5f","body":"Second","createdAt":"2026-11-12T09:56:29.799882062Z"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_3ba75ac8-c120-4ddb-b07c-46ecce134084/messages
correlation: qa-aa9be2af-3468-46c9-9bc3-60e15a3b78ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa9be2af-3468-46c9-9bc3-60e15a3b78ec
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 12 Nov 2026 09:56:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa9be2af-3468-46c9-9bc3-60e15a3b78ec
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

{"items":[{"id":"msg_1849e837-8248-4639-adea-6224a9de51d1","conversationId":"cnv_3ba75ac8-c120-4ddb-b07c-46ecce134084","sender":"qa-97138adc8e5f","body":"Hello","createdAt":"2026-11-12T09:56:29.673860683Z"},{"id":"msg_48b7c790-3d26-41ca-bdf9-e046914dc465","conversationId":"cnv_3ba75ac8-c120-4ddb-b07c-46ecce134084","sender":"qa-97138adc8e5f","body":"Second","createdAt":"2026-11-12T09:56:29.799882062Z"}],"total":2}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-2fa41058-3a15-461f-9239-f5ae1e9d8bef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fa41058-3a15-461f-9239-f5ae1e9d8bef
Content-Type: application/json

--- request body ---
{"handle":"qa-aef2c182440c","password":"****"}

--- response: 200 in 13 ms ---
Date: Thu, 12 Nov 2026 09:56:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-2fa41058-3a15-461f-9239-f5ae1e9d8bef
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6c7e0af6-9394-4611-b07d-889ba021f0b6"}
```

## 10. POST /v1/conversations/{id}/read

```text
#10 POST http://localhost:7070/v1/conversations/cnv_3ba75ac8-c120-4ddb-b07c-46ecce134084/read
correlation: qa-bb2a4cd1-7687-4e01-b400-6a014056c644

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb2a4cd1-7687-4e01-b400-6a014056c644
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 12 Nov 2026 09:56:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb2a4cd1-7687-4e01-b400-6a014056c644
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

{"conversationId":"cnv_3ba75ac8-c120-4ddb-b07c-46ecce134084","unreadCount":0}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-500b09b3-a6ab-4adb-8200-b73456f54ce8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-500b09b3-a6ab-4adb-8200-b73456f54ce8
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Thu, 12 Nov 2026 09:56:29 GMT
Content-Type: text/plain
X-Correlation-Id: qa-500b09b3-a6ab-4adb-8200-b73456f54ce8
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
correlation: qa-ca48bb87-e939-4c94-9186-5f26592c4355

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca48bb87-e939-4c94-9186-5f26592c4355
Content-Type: application/json

--- request body ---
{"handle":"qa-aef2c182440c","password":"****"}

--- response: 401 in 4 ms ---
Date: Thu, 12 Nov 2026 09:56:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ca48bb87-e939-4c94-9186-5f26592c4355
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ca48bb87-e939-4c94-9186-5f26592c4355"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cb4ab9f7-6d9f-46d4-baf0-8b46028493df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb4ab9f7-6d9f-46d4-baf0-8b46028493df
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Thu, 12 Nov 2026 09:56:29 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cb4ab9f7-6d9f-46d4-baf0-8b46028493df
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
correlation: qa-6e6d9fbd-8f8d-4b7a-9aac-ba62c363c887

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e6d9fbd-8f8d-4b7a-9aac-ba62c363c887
Content-Type: application/json

--- request body ---
{"handle":"qa-97138adc8e5f","password":"****"}

--- response: 401 in 4 ms ---
Date: Thu, 12 Nov 2026 09:56:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6e6d9fbd-8f8d-4b7a-9aac-ba62c363c887
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6e6d9fbd-8f8d-4b7a-9aac-ba62c363c887"}
```
