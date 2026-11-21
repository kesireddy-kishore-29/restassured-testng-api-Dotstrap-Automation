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
| 1 | `POST /v1/accounts` | 201 | 348 | `qa-55177241-4c44-4d82-85e4-5ae1a1e0a997` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-e654340f-ddb1-4d9a-9304-73a66d3b9515` |
| 3 | `POST /v1/auth/token` | 200 | 36 | `qa-e38a1293-2f4d-4581-93ab-40f3998f2cee` |
| 4 | `POST /v1/conversations` | 201 | 63 | `qa-03fefbf9-ab6e-41da-bc5b-da07d55f06fa` |
| 5 | `POST /v1/auth/token` | 200 | 30 | `qa-fb4b7d90-0b09-472b-8b29-1360f50a5aa6` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 19 | `qa-40214a86-ea7b-4c45-8115-8922ef267f83` |
| 7 | `GET /v1/conversations/{id}/messages` | 200 | 22 | `qa-b495a43b-2721-4679-b509-2a42d1d83e65` |
| 8 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-ee33756d-dd57-40e6-aecf-9c7ed6ff34d7` |
| 9 | `POST /v1/auth/token` | 401 | 9 | `qa-13353310-acf7-44f0-b6c2-9e03bdb638ff` |
| 10 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-a7b26525-4a10-4d0b-8882-826fa8026bf8` |
| 11 | `POST /v1/auth/token` | 401 | 7 | `qa-a58205c7-d4ce-498d-bdc1-48d93ab82b7e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-55177241-4c44-4d82-85e4-5ae1a1e0a997

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55177241-4c44-4d82-85e4-5ae1a1e0a997
Content-Type: application/json

--- request body ---
{"handle":"qa-3c8078a04fc1","displayName":"QA 3c8078a04fc1","password":"****","region":"eu"}

--- response: 201 in 348 ms ---
Date: Thu, 12 Nov 2026 09:56:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-55177241-4c44-4d82-85e4-5ae1a1e0a997
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
Location: /v1/accounts/qa-3c8078a04fc1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8155a4f9-641f-472f-8341-f894a1e1dc7a","handle":"qa-3c8078a04fc1","displayName":"QA 3c8078a04fc1","region":"eu","role":"user","createdAt":"2026-11-12T09:56:25.266232055Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e654340f-ddb1-4d9a-9304-73a66d3b9515

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e654340f-ddb1-4d9a-9304-73a66d3b9515
Content-Type: application/json

--- request body ---
{"handle":"qa-e300c98f99c8","displayName":"QA e300c98f99c8","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Thu, 12 Nov 2026 09:56:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-e654340f-ddb1-4d9a-9304-73a66d3b9515
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-e300c98f99c8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba16e6ea-a3c9-4138-a96d-8587b020aa62","handle":"qa-e300c98f99c8","displayName":"QA e300c98f99c8","region":"eu","role":"user","createdAt":"2026-11-12T09:56:25.594499692Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e38a1293-2f4d-4581-93ab-40f3998f2cee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e38a1293-2f4d-4581-93ab-40f3998f2cee
Content-Type: application/json

--- request body ---
{"handle":"qa-3c8078a04fc1","password":"****"}

--- response: 200 in 36 ms ---
Date: Thu, 12 Nov 2026 09:56:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-e38a1293-2f4d-4581-93ab-40f3998f2cee
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8155a4f9-641f-472f-8341-f894a1e1dc7a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-03fefbf9-ab6e-41da-bc5b-da07d55f06fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03fefbf9-ab6e-41da-bc5b-da07d55f06fa
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e300c98f99c8","subject":"Lunch?","message":"Free on Friday?"}

--- response: 201 in 63 ms ---
Date: Thu, 12 Nov 2026 09:56:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-03fefbf9-ab6e-41da-bc5b-da07d55f06fa
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
Location: /v1/conversations/cnv_fa33c518-cc07-44f4-bf74-ed3866e2dd83
X-Data-Region: eu
Content-Length: 229

{"id":"cnv_fa33c518-cc07-44f4-bf74-ed3866e2dd83","subject":"Lunch?","status":"open","region":"eu","participants":["qa-3c8078a04fc1","qa-e300c98f99c8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:25.726409473Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-fb4b7d90-0b09-472b-8b29-1360f50a5aa6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb4b7d90-0b09-472b-8b29-1360f50a5aa6
Content-Type: application/json

--- request body ---
{"handle":"qa-e300c98f99c8","password":"****"}

--- response: 200 in 30 ms ---
Date: Thu, 12 Nov 2026 09:56:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb4b7d90-0b09-472b-8b29-1360f50a5aa6
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ba16e6ea-a3c9-4138-a96d-8587b020aa62"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_fa33c518-cc07-44f4-bf74-ed3866e2dd83/messages
correlation: qa-40214a86-ea7b-4c45-8115-8922ef267f83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40214a86-ea7b-4c45-8115-8922ef267f83
Content-Type: application/json

--- request body ---
{"body":"Friday works"}

--- response: 201 in 19 ms ---
Date: Thu, 12 Nov 2026 09:56:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-40214a86-ea7b-4c45-8115-8922ef267f83
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

{"id":"msg_365d0683-0b50-46d8-9be5-4df3db032a48","conversationId":"cnv_fa33c518-cc07-44f4-bf74-ed3866e2dd83","sender":"qa-e300c98f99c8","body":"Friday works","createdAt":"2026-11-12T09:56:25.876970676Z"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_fa33c518-cc07-44f4-bf74-ed3866e2dd83/messages
correlation: qa-b495a43b-2721-4679-b509-2a42d1d83e65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b495a43b-2721-4679-b509-2a42d1d83e65
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Thu, 12 Nov 2026 09:56:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-b495a43b-2721-4679-b509-2a42d1d83e65
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

{"items":[{"id":"msg_d328155f-1d1c-4bef-a623-5a53f7f0429c","conversationId":"cnv_fa33c518-cc07-44f4-bf74-ed3866e2dd83","sender":"qa-3c8078a04fc1","body":"Free on Friday?","createdAt":"2026-11-12T09:56:25.726621579Z"},{"id":"msg_365d0683-0b50-46d8-9be5-4df3db032a48","conversationId":"cnv_fa33c518-cc07-44f4-bf74-ed3866e2dd83","sender":"qa-e300c98f99c8","body":"Friday works","createdAt":"2026-11-12T09:56:25.876970676Z"}],"total":2}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ee33756d-dd57-40e6-aecf-9c7ed6ff34d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee33756d-dd57-40e6-aecf-9c7ed6ff34d7
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Thu, 12 Nov 2026 09:56:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ee33756d-dd57-40e6-aecf-9c7ed6ff34d7
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
correlation: qa-13353310-acf7-44f0-b6c2-9e03bdb638ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13353310-acf7-44f0-b6c2-9e03bdb638ff
Content-Type: application/json

--- request body ---
{"handle":"qa-e300c98f99c8","password":"****"}

--- response: 401 in 9 ms ---
Date: Thu, 12 Nov 2026 09:56:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-13353310-acf7-44f0-b6c2-9e03bdb638ff
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-13353310-acf7-44f0-b6c2-9e03bdb638ff"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a7b26525-4a10-4d0b-8882-826fa8026bf8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7b26525-4a10-4d0b-8882-826fa8026bf8
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a7b26525-4a10-4d0b-8882-826fa8026bf8
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
correlation: qa-a58205c7-d4ce-498d-bdc1-48d93ab82b7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a58205c7-d4ce-498d-bdc1-48d93ab82b7e
Content-Type: application/json

--- request body ---
{"handle":"qa-3c8078a04fc1","password":"****"}

--- response: 401 in 7 ms ---
Date: Thu, 12 Nov 2026 09:56:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a58205c7-d4ce-498d-bdc1-48d93ab82b7e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a58205c7-d4ce-498d-bdc1-48d93ab82b7e"}
```
