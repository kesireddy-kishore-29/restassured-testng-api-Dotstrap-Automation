# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[16]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 38 | `qa-d068a88e-0d7f-437e-afd3-3e1ffae0e3d4` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-4cfe5cf1-0ea8-4eaf-87be-6111bbc7975d` |
| 3 | `POST /v1/auth/token` | 200 | 42 | `qa-ec670554-4942-49d8-8988-ef1150306442` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-c5c8cd72-1001-4a36-87cf-39f0170dfd54` |
| 5 | `POST /v1/credits/purchases` | 415 | 14 | `qa-1aed57c6-711b-4cd7-83ce-a69716e3996c` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-edb7ae48-6e6f-4ef4-9a9f-4c986db8c47e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-1784140b-baa3-4267-ad60-8ec4971ff602` |
| 8 | `POST /v1/auth/token` | 401 | 7 | `qa-953b9328-6b56-432c-bae6-db2e966583cb` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-27fe1ece-575e-435a-8ffa-25d8d6153040` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-24450eff-59ae-4272-b581-280211f531a5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d068a88e-0d7f-437e-afd3-3e1ffae0e3d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d068a88e-0d7f-437e-afd3-3e1ffae0e3d4
Content-Type: application/json

--- request body ---
{"handle":"qa-e1a0352dbf81","displayName":"QA e1a0352dbf81","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-d068a88e-0d7f-437e-afd3-3e1ffae0e3d4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 322
RateLimit-Reset: 5
Location: /v1/accounts/qa-e1a0352dbf81
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f3d145d-4ecf-4841-953a-afc1daa07eb0","handle":"qa-e1a0352dbf81","displayName":"QA e1a0352dbf81","region":"eu","role":"user","createdAt":"2026-11-19T10:29:27.389861328Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4cfe5cf1-0ea8-4eaf-87be-6111bbc7975d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cfe5cf1-0ea8-4eaf-87be-6111bbc7975d
Content-Type: application/json

--- request body ---
{"handle":"qa-a85698c86670","displayName":"QA a85698c86670","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-4cfe5cf1-0ea8-4eaf-87be-6111bbc7975d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 316
RateLimit-Reset: 5
Location: /v1/accounts/qa-a85698c86670
X-Served-Region: eu
Content-Length: 181

{"id":"acc_985bce96-de1b-4b3f-b5d9-eb6ced45ecc1","handle":"qa-a85698c86670","displayName":"QA a85698c86670","region":"eu","role":"user","createdAt":"2026-11-19T10:29:27.445112408Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ec670554-4942-49d8-8988-ef1150306442

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec670554-4942-49d8-8988-ef1150306442
Content-Type: application/json

--- request body ---
{"handle":"qa-e1a0352dbf81","password":"****"}

--- response: 200 in 42 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec670554-4942-49d8-8988-ef1150306442
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 313
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7f3d145d-4ecf-4841-953a-afc1daa07eb0"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c5c8cd72-1001-4a36-87cf-39f0170dfd54

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5c8cd72-1001-4a36-87cf-39f0170dfd54
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a85698c86670","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-c5c8cd72-1001-4a36-87cf-39f0170dfd54
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
Location: /v1/conversations/cnv_1344aeff-f087-4e2c-a333-e9c191e23943
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1344aeff-f087-4e2c-a333-e9c191e23943","subject":"Error contract","status":"open","region":"eu","participants":["qa-e1a0352dbf81","qa-a85698c86670"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:27.547509272Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1aed57c6-711b-4cd7-83ce-a69716e3996c

--- request headers ---
Accept: application/json
Idempotency-Key: qa-307a8e9880854d30b93071122a3e55cb
X-Correlation-Id: qa-1aed57c6-711b-4cd7-83ce-a69716e3996c
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 14 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1aed57c6-711b-4cd7-83ce-a69716e3996c
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
Content-Length: 261

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/credits/purchases","correlationId":"qa-1aed57c6-711b-4cd7-83ce-a69716e3996c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-edb7ae48-6e6f-4ef4-9a9f-4c986db8c47e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-edb7ae48-6e6f-4ef4-9a9f-4c986db8c47e
Content-Type: application/json

--- request body ---
{"handle":"qa-a85698c86670","password":"****"}

--- response: 200 in 23 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-edb7ae48-6e6f-4ef4-9a9f-4c986db8c47e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 301
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_985bce96-de1b-4b3f-b5d9-eb6ced45ecc1"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1784140b-baa3-4267-ad60-8ec4971ff602

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1784140b-baa3-4267-ad60-8ec4971ff602
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1784140b-baa3-4267-ad60-8ec4971ff602
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
correlation: qa-953b9328-6b56-432c-bae6-db2e966583cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-953b9328-6b56-432c-bae6-db2e966583cb
Content-Type: application/json

--- request body ---
{"handle":"qa-a85698c86670","password":"****"}

--- response: 401 in 7 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-953b9328-6b56-432c-bae6-db2e966583cb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 299
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-953b9328-6b56-432c-bae6-db2e966583cb"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-27fe1ece-575e-435a-8ffa-25d8d6153040

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27fe1ece-575e-435a-8ffa-25d8d6153040
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-27fe1ece-575e-435a-8ffa-25d8d6153040
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-24450eff-59ae-4272-b581-280211f531a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24450eff-59ae-4272-b581-280211f531a5
Content-Type: application/json

--- request body ---
{"handle":"qa-e1a0352dbf81","password":"****"}

--- response: 401 in 8 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-24450eff-59ae-4272-b581-280211f531a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 296
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-24450eff-59ae-4272-b581-280211f531a5"}
```
