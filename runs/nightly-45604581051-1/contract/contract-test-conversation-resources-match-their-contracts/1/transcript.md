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
| 1 | `POST /v1/accounts` | 201 | 331 | `qa-b3e4b5f6-45ba-4a24-9c22-bd72d44971de` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-f2e9a7f9-14bd-4f1c-a8eb-f2de93dbb237` |
| 3 | `POST /v1/auth/token` | 200 | 18 | `qa-de7412d2-7b36-4ab3-9942-5172277d1734` |
| 4 | `POST /v1/conversations` | 201 | 46 | `qa-d4127253-7d55-4af7-919c-d29cc81ea564` |
| 5 | `GET /v1/conversations` | 200 | 19 | `qa-1fac0c4a-ab58-411e-beb1-0890fbcfd908` |
| 6 | `GET /v1/conversations/{id}` | 200 | 9 | `qa-494c68fb-805a-427b-bcd5-14ca9a5f11f3` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 24 | `qa-f7170478-0cb9-4262-9984-675cafea0849` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 24 | `qa-4bdfbe84-6fea-44b5-aa02-1fcfc5284ab5` |
| 9 | `POST /v1/auth/token` | 200 | 13 | `qa-7db71904-8639-4ed0-8851-d86cb1cbdc79` |
| 10 | `POST /v1/conversations/{id}/read` | 200 | 9 | `qa-75d7f640-1fe9-4dbe-adca-ee2b7b4067f6` |
| 11 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-9bb6626a-6026-4606-9c48-86cf8bd6238f` |
| 12 | `POST /v1/auth/token` | 401 | 12 | `qa-93790281-b2ea-4907-8201-3107d207dbea` |
| 13 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-c3952388-4f5f-4f05-a7ba-d929dd3cf3c8` |
| 14 | `POST /v1/auth/token` | 401 | 8 | `qa-4e405e3c-97fb-4af2-bbb0-9f77c8be2d7e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b3e4b5f6-45ba-4a24-9c22-bd72d44971de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3e4b5f6-45ba-4a24-9c22-bd72d44971de
Content-Type: application/json

--- request body ---
{"handle":"qa-cbdcc220d169","displayName":"QA cbdcc220d169","password":"****","region":"eu"}

--- response: 201 in 331 ms ---
Date: Wed, 25 Nov 2026 11:27:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3e4b5f6-45ba-4a24-9c22-bd72d44971de
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
Location: /v1/accounts/qa-cbdcc220d169
X-Served-Region: eu
Content-Length: 181

{"id":"acc_76fc9f21-e595-473e-9ba0-dd711f5afc6d","handle":"qa-cbdcc220d169","displayName":"QA cbdcc220d169","region":"eu","role":"user","createdAt":"2026-11-25T11:27:56.408246810Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f2e9a7f9-14bd-4f1c-a8eb-f2de93dbb237

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2e9a7f9-14bd-4f1c-a8eb-f2de93dbb237
Content-Type: application/json

--- request body ---
{"handle":"qa-a885781da752","displayName":"QA a885781da752","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Wed, 25 Nov 2026 11:27:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-f2e9a7f9-14bd-4f1c-a8eb-f2de93dbb237
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
Location: /v1/accounts/qa-a885781da752
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5ea858b9-d241-4711-805e-8e399c95fb17","handle":"qa-a885781da752","displayName":"QA a885781da752","region":"eu","role":"user","createdAt":"2026-11-25T11:27:56.711017767Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-de7412d2-7b36-4ab3-9942-5172277d1734

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de7412d2-7b36-4ab3-9942-5172277d1734
Content-Type: application/json

--- request body ---
{"handle":"qa-cbdcc220d169","password":"****"}

--- response: 200 in 18 ms ---
Date: Wed, 25 Nov 2026 11:27:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-de7412d2-7b36-4ab3-9942-5172277d1734
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_76fc9f21-e595-473e-9ba0-dd711f5afc6d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d4127253-7d55-4af7-919c-d29cc81ea564

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4127253-7d55-4af7-919c-d29cc81ea564
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a885781da752","subject":"Contract check","message":"Hello"}

--- response: 201 in 46 ms ---
Date: Wed, 25 Nov 2026 11:27:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-d4127253-7d55-4af7-919c-d29cc81ea564
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
Location: /v1/conversations/cnv_b284d7c2-a231-4d35-865b-8c543cbf1823
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b284d7c2-a231-4d35-865b-8c543cbf1823","subject":"Contract check","status":"open","region":"eu","participants":["qa-cbdcc220d169","qa-a885781da752"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:56.804906914Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-1fac0c4a-ab58-411e-beb1-0890fbcfd908

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1fac0c4a-ab58-411e-beb1-0890fbcfd908
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Wed, 25 Nov 2026 11:27:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-1fac0c4a-ab58-411e-beb1-0890fbcfd908
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

{"items":[{"id":"cnv_b284d7c2-a231-4d35-865b-8c543cbf1823","subject":"Contract check","status":"open","region":"eu","participants":["qa-cbdcc220d169","qa-a885781da752"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:56.804906914Z"}],"total":1}
```

## 6. GET /v1/conversations/{id}

```text
#6 GET http://localhost:7070/v1/conversations/cnv_b284d7c2-a231-4d35-865b-8c543cbf1823
correlation: qa-494c68fb-805a-427b-bcd5-14ca9a5f11f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-494c68fb-805a-427b-bcd5-14ca9a5f11f3
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 25 Nov 2026 11:27:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-494c68fb-805a-427b-bcd5-14ca9a5f11f3
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

{"id":"cnv_b284d7c2-a231-4d35-865b-8c543cbf1823","subject":"Contract check","status":"open","region":"eu","participants":["qa-cbdcc220d169","qa-a885781da752"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:56.804906914Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_b284d7c2-a231-4d35-865b-8c543cbf1823/messages
correlation: qa-f7170478-0cb9-4262-9984-675cafea0849

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7170478-0cb9-4262-9984-675cafea0849
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 24 ms ---
Date: Wed, 25 Nov 2026 11:27:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7170478-0cb9-4262-9984-675cafea0849
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

{"id":"msg_8936c9bf-ffbe-4162-8b26-08f0e7641e93","conversationId":"cnv_b284d7c2-a231-4d35-865b-8c543cbf1823","sender":"qa-cbdcc220d169","body":"Second","createdAt":"2026-11-25T11:27:56.934155927Z"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_b284d7c2-a231-4d35-865b-8c543cbf1823/messages
correlation: qa-4bdfbe84-6fea-44b5-aa02-1fcfc5284ab5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4bdfbe84-6fea-44b5-aa02-1fcfc5284ab5
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Wed, 25 Nov 2026 11:27:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-4bdfbe84-6fea-44b5-aa02-1fcfc5284ab5
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

{"items":[{"id":"msg_fcdbaf02-01a5-4b63-9e76-a53695b23eb8","conversationId":"cnv_b284d7c2-a231-4d35-865b-8c543cbf1823","sender":"qa-cbdcc220d169","body":"Hello","createdAt":"2026-11-25T11:27:56.805057367Z"},{"id":"msg_8936c9bf-ffbe-4162-8b26-08f0e7641e93","conversationId":"cnv_b284d7c2-a231-4d35-865b-8c543cbf1823","sender":"qa-cbdcc220d169","body":"Second","createdAt":"2026-11-25T11:27:56.934155927Z"}],"total":2}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-7db71904-8639-4ed0-8851-d86cb1cbdc79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7db71904-8639-4ed0-8851-d86cb1cbdc79
Content-Type: application/json

--- request body ---
{"handle":"qa-a885781da752","password":"****"}

--- response: 200 in 13 ms ---
Date: Wed, 25 Nov 2026 11:27:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-7db71904-8639-4ed0-8851-d86cb1cbdc79
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5ea858b9-d241-4711-805e-8e399c95fb17"}
```

## 10. POST /v1/conversations/{id}/read

```text
#10 POST http://localhost:7070/v1/conversations/cnv_b284d7c2-a231-4d35-865b-8c543cbf1823/read
correlation: qa-75d7f640-1fe9-4dbe-adca-ee2b7b4067f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75d7f640-1fe9-4dbe-adca-ee2b7b4067f6
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-75d7f640-1fe9-4dbe-adca-ee2b7b4067f6
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

{"conversationId":"cnv_b284d7c2-a231-4d35-865b-8c543cbf1823","unreadCount":0}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9bb6626a-6026-4606-9c48-86cf8bd6238f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9bb6626a-6026-4606-9c48-86cf8bd6238f
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9bb6626a-6026-4606-9c48-86cf8bd6238f
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
correlation: qa-93790281-b2ea-4907-8201-3107d207dbea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93790281-b2ea-4907-8201-3107d207dbea
Content-Type: application/json

--- request body ---
{"handle":"qa-a885781da752","password":"****"}

--- response: 401 in 12 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-93790281-b2ea-4907-8201-3107d207dbea
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-93790281-b2ea-4907-8201-3107d207dbea"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c3952388-4f5f-4f05-a7ba-d929dd3cf3c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3952388-4f5f-4f05-a7ba-d929dd3cf3c8
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c3952388-4f5f-4f05-a7ba-d929dd3cf3c8
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
correlation: qa-4e405e3c-97fb-4af2-bbb0-9f77c8be2d7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e405e3c-97fb-4af2-bbb0-9f77c8be2d7e
Content-Type: application/json

--- request body ---
{"handle":"qa-cbdcc220d169","password":"****"}

--- response: 401 in 8 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4e405e3c-97fb-4af2-bbb0-9f77c8be2d7e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4e405e3c-97fb-4af2-bbb0-9f77c8be2d7e"}
```
