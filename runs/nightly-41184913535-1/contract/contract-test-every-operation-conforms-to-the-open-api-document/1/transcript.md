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
| 1 | `POST /v1/accounts` | 201 | 13 | `qa-a89347a0-9bc0-4544-8149-7dff70a26b64` |
| 2 | `POST /v1/accounts` | 201 | 19 | `qa-f4b884d9-41c3-4bea-a36e-35aab500526e` |
| 3 | `GET /health` | 200 | 9 | `qa-a5aa093d-5fe6-4f63-a5d4-546956a75ac5` |
| 4 | `POST /v1/auth/token` | 200 | 26 | `qa-649b5711-2807-41a9-9848-aded4651a50d` |
| 5 | `GET /v1/accounts/me` | 200 | 6 | `qa-ed6bf011-7912-40b3-8584-b4a60421c0f8` |
| 6 | `PATCH /v1/accounts/me` | 200 | 13 | `qa-28973c4f-8c6d-4986-b70b-5b1b15768e79` |
| 7 | `GET /v1/accounts/{handle}` | 200 | 12 | `qa-91376c23-884b-4c60-9fa5-b61c66c8959e` |
| 8 | `POST /v1/conversations` | 201 | 10 | `qa-fe84740c-0cd9-4507-9f40-e8a8dca91fc5` |
| 9 | `GET /v1/conversations` | 200 | 13 | `qa-f131eab6-c05d-4c14-a591-c9c5b6e00085` |
| 10 | `POST /v1/auth/token` | 200 | 22 | `qa-44c8c30f-d0c1-464f-9485-7a4702160a8e` |
| 11 | `GET /v1/conversations/{id}` | 200 | 7 | `qa-dd343750-9b85-4786-abff-d149dc116354` |
| 12 | `GET /v1/conversations/{id}/messages` | 200 | 6 | `qa-6b04f6dd-dc14-4951-aac1-f17cac622293` |
| 13 | `POST /v1/conversations/{id}/messages` | 201 | 5 | `qa-d8b9890e-ae91-46ae-aeb4-13f37b27b54b` |
| 14 | `POST /v1/conversations/{id}/read` | 200 | 4 | `qa-68b8fa97-01fb-4d64-8079-61aebe76a40e` |
| 15 | `POST /v1/conversations/{id}/close` | 200 | 4 | `qa-efa15c14-97a8-418c-8946-3edf0ad02832` |
| 16 | `GET /v1/credits/balance` | 200 | 6 | `qa-9918900b-22a8-494f-bda8-8c0e2ec3ae2d` |
| 17 | `GET /v1/credits/ledger` | 200 | 8 | `qa-9ac538d9-7a01-43ce-ab48-90f8afb8ab88` |
| 18 | `POST /v1/credits/purchases` | 201 | 9 | `qa-de4c12d1-b511-4d4b-b2b9-4643c072c724` |
| 19 | `GET /v1/admin/stats` | 403 | 5 | `qa-80addbb0-bee9-403b-9bee-0c51ede16d43` |
| 20 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-d1d69a60-e89d-4380-a0a8-6485f71b5374` |
| 21 | `POST /v1/auth/token` | 401 | 14 | `qa-88284e1e-bc3c-43c9-8802-debeda04c337` |
| 22 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-5c9b651b-0a66-4835-a1ee-4c63736b0139` |
| 23 | `POST /v1/auth/token` | 401 | 6 | `qa-a4572b20-decb-4331-90bb-c3b7a5b8c6ac` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a89347a0-9bc0-4544-8149-7dff70a26b64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a89347a0-9bc0-4544-8149-7dff70a26b64
Content-Type: application/json

--- request body ---
{"handle":"qa-656b0702ca7b","displayName":"QA 656b0702ca7b","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-a89347a0-9bc0-4544-8149-7dff70a26b64
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 281
RateLimit-Reset: 6
Location: /v1/accounts/qa-656b0702ca7b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ced30544-153b-4d1a-ad5c-8691f5289c0e","handle":"qa-656b0702ca7b","displayName":"QA 656b0702ca7b","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.450217719Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f4b884d9-41c3-4bea-a36e-35aab500526e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4b884d9-41c3-4bea-a36e-35aab500526e
Content-Type: application/json

--- request body ---
{"handle":"qa-90839929d8d8","displayName":"QA 90839929d8d8","password":"****","region":"us"}

--- response: 201 in 19 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-f4b884d9-41c3-4bea-a36e-35aab500526e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 279
RateLimit-Reset: 6
Location: /v1/accounts/qa-90839929d8d8
X-Served-Region: us
Content-Length: 181

{"id":"acc_2de71fb8-09ab-4078-8cd7-483edfae5232","handle":"qa-90839929d8d8","displayName":"QA 90839929d8d8","region":"us","role":"user","createdAt":"2026-10-31T08:31:37.473956753Z"}
```

## 3. GET /health

```text
#3 GET http://localhost:7070/health
correlation: qa-a5aa093d-5fe6-4f63-a5d4-546956a75ac5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5aa093d-5fe6-4f63-a5d4-546956a75ac5
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-a5aa093d-5fe6-4f63-a5d4-546956a75ac5
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
correlation: qa-649b5711-2807-41a9-9848-aded4651a50d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-649b5711-2807-41a9-9848-aded4651a50d
Content-Type: application/json

--- request body ---
{"handle":"qa-656b0702ca7b","password":"****"}

--- response: 200 in 26 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-649b5711-2807-41a9-9848-aded4651a50d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 278
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ced30544-153b-4d1a-ad5c-8691f5289c0e"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-ed6bf011-7912-40b3-8584-b4a60421c0f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed6bf011-7912-40b3-8584-b4a60421c0f8
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed6bf011-7912-40b3-8584-b4a60421c0f8
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

{"id":"acc_ced30544-153b-4d1a-ad5c-8691f5289c0e","handle":"qa-656b0702ca7b","displayName":"QA 656b0702ca7b","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.450217719Z"}
```

## 6. PATCH /v1/accounts/me

```text
#6 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-28973c4f-8c6d-4986-b70b-5b1b15768e79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28973c4f-8c6d-4986-b70b-5b1b15768e79
Content-Type: application/json

--- request body ---
{"displayName":"Ava Contract"}

--- response: 200 in 13 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-28973c4f-8c6d-4986-b70b-5b1b15768e79
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

{"id":"acc_ced30544-153b-4d1a-ad5c-8691f5289c0e","handle":"qa-656b0702ca7b","displayName":"Ava Contract","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.450217719Z"}
```

## 7. GET /v1/accounts/{handle}

```text
#7 GET http://localhost:7070/v1/accounts/qa-90839929d8d8
correlation: qa-91376c23-884b-4c60-9fa5-b61c66c8959e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91376c23-884b-4c60-9fa5-b61c66c8959e
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-91376c23-884b-4c60-9fa5-b61c66c8959e
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

{"handle":"qa-90839929d8d8","displayName":"QA 90839929d8d8","region":"us"}
```

## 8. POST /v1/conversations

```text
#8 POST http://localhost:7070/v1/conversations
correlation: qa-fe84740c-0cd9-4507-9f40-e8a8dca91fc5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe84740c-0cd9-4507-9f40-e8a8dca91fc5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-90839929d8d8","subject":"OpenAPI journey","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-fe84740c-0cd9-4507-9f40-e8a8dca91fc5
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
Location: /v1/conversations/cnv_b69f078c-bf55-45ce-aaad-da62618bc58b
X-Data-Region: us
Content-Length: 238

{"id":"cnv_b69f078c-bf55-45ce-aaad-da62618bc58b","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-656b0702ca7b","qa-90839929d8d8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:37.595034219Z"}
```

## 9. GET /v1/conversations

```text
#9 GET http://localhost:7070/v1/conversations
correlation: qa-f131eab6-c05d-4c14-a591-c9c5b6e00085

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f131eab6-c05d-4c14-a591-c9c5b6e00085
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-f131eab6-c05d-4c14-a591-c9c5b6e00085
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

{"items":[{"id":"cnv_b69f078c-bf55-45ce-aaad-da62618bc58b","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-656b0702ca7b","qa-90839929d8d8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:37.595034219Z"}],"total":1}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-44c8c30f-d0c1-464f-9485-7a4702160a8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44c8c30f-d0c1-464f-9485-7a4702160a8e
Content-Type: application/json

--- request body ---
{"handle":"qa-90839929d8d8","password":"****"}

--- response: 200 in 22 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-44c8c30f-d0c1-464f-9485-7a4702160a8e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 273
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2de71fb8-09ab-4078-8cd7-483edfae5232"}
```

## 11. GET /v1/conversations/{id}

```text
#11 GET http://localhost:7070/v1/conversations/cnv_b69f078c-bf55-45ce-aaad-da62618bc58b
correlation: qa-dd343750-9b85-4786-abff-d149dc116354

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd343750-9b85-4786-abff-d149dc116354
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-dd343750-9b85-4786-abff-d149dc116354
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

{"id":"cnv_b69f078c-bf55-45ce-aaad-da62618bc58b","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-656b0702ca7b","qa-90839929d8d8"],"messageCount":1,"unreadCount":1,"createdAt":"2026-10-31T08:31:37.595034219Z"}
```

## 12. GET /v1/conversations/{id}/messages

```text
#12 GET http://localhost:7070/v1/conversations/cnv_b69f078c-bf55-45ce-aaad-da62618bc58b/messages
correlation: qa-6b04f6dd-dc14-4951-aac1-f17cac622293

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b04f6dd-dc14-4951-aac1-f17cac622293
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b04f6dd-dc14-4951-aac1-f17cac622293
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

{"items":[{"id":"msg_91148fde-7f83-41ab-b6ef-046022b34cf8","conversationId":"cnv_b69f078c-bf55-45ce-aaad-da62618bc58b","sender":"qa-656b0702ca7b","body":"Hi","createdAt":"2026-10-31T08:31:37.595039610Z"}],"total":1}
```

## 13. POST /v1/conversations/{id}/messages

```text
#13 POST http://localhost:7070/v1/conversations/cnv_b69f078c-bf55-45ce-aaad-da62618bc58b/messages
correlation: qa-d8b9890e-ae91-46ae-aeb4-13f37b27b54b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8b9890e-ae91-46ae-aeb4-13f37b27b54b
Content-Type: application/json

--- request body ---
{"body":"Reply"}

--- response: 201 in 5 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8b9890e-ae91-46ae-aeb4-13f37b27b54b
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

{"id":"msg_0e0acf22-3970-4175-85d2-f91537028aa6","conversationId":"cnv_b69f078c-bf55-45ce-aaad-da62618bc58b","sender":"qa-90839929d8d8","body":"Reply","createdAt":"2026-10-31T08:31:37.721980325Z"}
```

## 14. POST /v1/conversations/{id}/read

```text
#14 POST http://localhost:7070/v1/conversations/cnv_b69f078c-bf55-45ce-aaad-da62618bc58b/read
correlation: qa-68b8fa97-01fb-4d64-8079-61aebe76a40e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68b8fa97-01fb-4d64-8079-61aebe76a40e
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-68b8fa97-01fb-4d64-8079-61aebe76a40e
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

{"conversationId":"cnv_b69f078c-bf55-45ce-aaad-da62618bc58b","unreadCount":0}
```

## 15. POST /v1/conversations/{id}/close

```text
#15 POST http://localhost:7070/v1/conversations/cnv_b69f078c-bf55-45ce-aaad-da62618bc58b/close
correlation: qa-efa15c14-97a8-418c-8946-3edf0ad02832

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-efa15c14-97a8-418c-8946-3edf0ad02832
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-efa15c14-97a8-418c-8946-3edf0ad02832
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

{"id":"cnv_b69f078c-bf55-45ce-aaad-da62618bc58b","subject":"OpenAPI journey","status":"closed","region":"us","participants":["qa-656b0702ca7b","qa-90839929d8d8"],"messageCount":2,"unreadCount":0,"createdAt":"2026-10-31T08:31:37.595034219Z","closedAt":"2026-10-31T08:31:37.737670321Z"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-9918900b-22a8-494f-bda8-8c0e2ec3ae2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9918900b-22a8-494f-bda8-8c0e2ec3ae2d
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-9918900b-22a8-494f-bda8-8c0e2ec3ae2d
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

{"balance":4,"currency":"credits","accountId":"acc_ced30544-153b-4d1a-ad5c-8691f5289c0e"}
```

## 17. GET /v1/credits/ledger

```text
#17 GET http://localhost:7070/v1/credits/ledger
correlation: qa-9ac538d9-7a01-43ce-ab48-90f8afb8ab88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ac538d9-7a01-43ce-ab48-90f8afb8ab88
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ac538d9-7a01-43ce-ab48-90f8afb8ab88
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

{"items":[{"id":"led_86d655ab-b843-4f19-8836-6a7f2d1f83c4","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-31T08:31:37.450226486Z"},{"id":"led_b1531fa2-2cd4-47e2-8ed3-d0e285ae0aa6","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_b69f078c-bf55-45ce-aaad-da62618bc58b","createdAt":"2026-10-31T08:31:37.595025944Z"}],"total":2,"balance":4}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-de4c12d1-b511-4d4b-b2b9-4643c072c724

--- request headers ---
Accept: application/json
Idempotency-Key: qa-91bdad80a9e9417da023623fbd7adf27
X-Correlation-Id: qa-de4c12d1-b511-4d4b-b2b9-4643c072c724
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 9 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-de4c12d1-b511-4d4b-b2b9-4643c072c724
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
Location: /v1/credits/purchases/pur_78138aaf-c241-4bee-830a-9c904da1e776
Content-Length: 144

{"id":"pur_78138aaf-c241-4bee-830a-9c904da1e776","packId":"pack-50","credits":50,"balanceAfter":54,"createdAt":"2026-10-31T08:31:37.774044256Z"}
```

## 19. GET /v1/admin/stats

```text
#19 GET http://localhost:7070/v1/admin/stats
correlation: qa-80addbb0-bee9-403b-9bee-0c51ede16d43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80addbb0-bee9-403b-9bee-0c51ede16d43
Content-Type: application/json

--- response: 403 in 5 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-80addbb0-bee9-403b-9bee-0c51ede16d43
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-80addbb0-bee9-403b-9bee-0c51ede16d43"}
```

## 20. DELETE /v1/accounts/me

```text
#20 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d1d69a60-e89d-4380-a0a8-6485f71b5374

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1d69a60-e89d-4380-a0a8-6485f71b5374
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d1d69a60-e89d-4380-a0a8-6485f71b5374
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
correlation: qa-88284e1e-bc3c-43c9-8802-debeda04c337

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88284e1e-bc3c-43c9-8802-debeda04c337
Content-Type: application/json

--- request body ---
{"handle":"qa-90839929d8d8","password":"****"}

--- response: 401 in 14 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-88284e1e-bc3c-43c9-8802-debeda04c337
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 272
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-88284e1e-bc3c-43c9-8802-debeda04c337"}
```

## 22. DELETE /v1/accounts/me

```text
#22 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5c9b651b-0a66-4835-a1ee-4c63736b0139

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c9b651b-0a66-4835-a1ee-4c63736b0139
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5c9b651b-0a66-4835-a1ee-4c63736b0139
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
correlation: qa-a4572b20-decb-4331-90bb-c3b7a5b8c6ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4572b20-decb-4331-90bb-c3b7a5b8c6ac
Content-Type: application/json

--- request body ---
{"handle":"qa-656b0702ca7b","password":"****"}

--- response: 401 in 6 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a4572b20-decb-4331-90bb-c3b7a5b8c6ac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 271
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a4572b20-decb-4331-90bb-c3b7a5b8c6ac"}
```
