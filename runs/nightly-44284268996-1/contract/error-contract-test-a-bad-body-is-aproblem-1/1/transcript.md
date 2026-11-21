# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 38 | `qa-f1c61ee9-e97a-4aa8-84d7-aeb1efac7ce7` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-90be9e2b-471b-41e5-9cf7-7f23ece9b43e` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-bcd62388-276b-4a66-897b-753979c82f4d` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-d52bb6e4-d056-46ed-aab5-88a2ec5e26a5` |
| 5 | `POST /v1/auth/token` | 415 | 34 | `qa-b2130d6e-4cbc-43ad-bcd0-3854fe8fed2e` |
| 6 | `POST /v1/auth/token` | 200 | 35 | `qa-41d59a0f-8e60-44c6-a80c-67239d349978` |
| 7 | `DELETE /v1/accounts/me` | 204 | 33 | `qa-adfdd904-296d-4fc4-a89c-fd7c291e48bd` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-b1fd8367-e77b-42f4-ae9c-44843c53f31f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-37a3c617-2f85-420e-ad42-9c72821c361d` |
| 10 | `POST /v1/auth/token` | 401 | 27 | `qa-03ae31c1-3781-405e-912c-c96ba696998d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f1c61ee9-e97a-4aa8-84d7-aeb1efac7ce7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1c61ee9-e97a-4aa8-84d7-aeb1efac7ce7
Content-Type: application/json

--- request body ---
{"handle":"qa-a278d0b9d09d","displayName":"QA a278d0b9d09d","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1c61ee9-e97a-4aa8-84d7-aeb1efac7ce7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 10
Location: /v1/accounts/qa-a278d0b9d09d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e4e755d7-9aff-4861-bbf9-ae44cc9ef8ba","handle":"qa-a278d0b9d09d","displayName":"QA a278d0b9d09d","region":"eu","role":"user","createdAt":"2026-11-18T10:19:50.528837694Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-90be9e2b-471b-41e5-9cf7-7f23ece9b43e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90be9e2b-471b-41e5-9cf7-7f23ece9b43e
Content-Type: application/json

--- request body ---
{"handle":"qa-2c8740ff84e1","displayName":"QA 2c8740ff84e1","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-90be9e2b-471b-41e5-9cf7-7f23ece9b43e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 10
Location: /v1/accounts/qa-2c8740ff84e1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f18a0c06-789c-4c46-9d49-e83dc012fb69","handle":"qa-2c8740ff84e1","displayName":"QA 2c8740ff84e1","region":"eu","role":"user","createdAt":"2026-11-18T10:19:50.588610319Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-bcd62388-276b-4a66-897b-753979c82f4d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bcd62388-276b-4a66-897b-753979c82f4d
Content-Type: application/json

--- request body ---
{"handle":"qa-a278d0b9d09d","password":"****"}

--- response: 200 in 16 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-bcd62388-276b-4a66-897b-753979c82f4d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 554
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e4e755d7-9aff-4861-bbf9-ae44cc9ef8ba"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d52bb6e4-d056-46ed-aab5-88a2ec5e26a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d52bb6e4-d056-46ed-aab5-88a2ec5e26a5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2c8740ff84e1","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-d52bb6e4-d056-46ed-aab5-88a2ec5e26a5
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
Location: /v1/conversations/cnv_c02a4174-b065-4c6b-ad8b-5cea59da0ebe
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c02a4174-b065-4c6b-ad8b-5cea59da0ebe","subject":"Error contract","status":"open","region":"eu","participants":["qa-a278d0b9d09d","qa-2c8740ff84e1"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:50.622521145Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-b2130d6e-4cbc-43ad-bcd0-3854fe8fed2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2130d6e-4cbc-43ad-bcd0-3854fe8fed2e
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 34 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b2130d6e-4cbc-43ad-bcd0-3854fe8fed2e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 546
RateLimit-Reset: 9
Content-Length: 254

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/auth/token","correlationId":"qa-b2130d6e-4cbc-43ad-bcd0-3854fe8fed2e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-41d59a0f-8e60-44c6-a80c-67239d349978

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41d59a0f-8e60-44c6-a80c-67239d349978
Content-Type: application/json

--- request body ---
{"handle":"qa-2c8740ff84e1","password":"****"}

--- response: 200 in 35 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-41d59a0f-8e60-44c6-a80c-67239d349978
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 522
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f18a0c06-789c-4c46-9d49-e83dc012fb69"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-adfdd904-296d-4fc4-a89c-fd7c291e48bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-adfdd904-296d-4fc4-a89c-fd7c291e48bd
Content-Type: application/json

--- response: 204 in 33 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-adfdd904-296d-4fc4-a89c-fd7c291e48bd
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

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-b1fd8367-e77b-42f4-ae9c-44843c53f31f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1fd8367-e77b-42f4-ae9c-44843c53f31f
Content-Type: application/json

--- request body ---
{"handle":"qa-2c8740ff84e1","password":"****"}

--- response: 401 in 16 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b1fd8367-e77b-42f4-ae9c-44843c53f31f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 507
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b1fd8367-e77b-42f4-ae9c-44843c53f31f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-37a3c617-2f85-420e-ad42-9c72821c361d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37a3c617-2f85-420e-ad42-9c72821c361d
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-37a3c617-2f85-420e-ad42-9c72821c361d
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-03ae31c1-3781-405e-912c-c96ba696998d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03ae31c1-3781-405e-912c-c96ba696998d
Content-Type: application/json

--- request body ---
{"handle":"qa-a278d0b9d09d","password":"****"}

--- response: 401 in 27 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-03ae31c1-3781-405e-912c-c96ba696998d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 496
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-03ae31c1-3781-405e-912c-c96ba696998d"}
```
