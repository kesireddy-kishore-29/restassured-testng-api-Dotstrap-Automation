# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[13]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-01301256-9afa-4095-984b-40c9995e0de5` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-08fcebfb-5de8-4dd9-a37e-3408ff630193` |
| 3 | `POST /v1/auth/token` | 200 | 50 | `qa-a2af5b3a-3499-4f58-9b7d-c7b946586442` |
| 4 | `POST /v1/conversations` | 201 | 35 | `qa-9475459d-b532-4f55-9607-e9635cd35c1d` |
| 5 | `POST /v1/conversations/{id}/messages` | 415 | 12 | `qa-e0199dc9-323c-4b0c-813f-76aa34b6ee80` |
| 6 | `POST /v1/auth/token` | 200 | 17 | `qa-94678114-abdd-46a2-8adf-95a3557c8c89` |
| 7 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-0879a02a-17e4-4307-9aea-f4aaa93a2222` |
| 8 | `POST /v1/auth/token` | 401 | 22 | `qa-7d18c6d4-acfc-4731-a5eb-f948169dedd0` |
| 9 | `DELETE /v1/accounts/me` | 204 | 34 | `qa-066b1f91-5a05-46e6-82c7-50d5d3c2df85` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-700f77c2-1145-4b19-bf76-c60978a8d59e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-01301256-9afa-4095-984b-40c9995e0de5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01301256-9afa-4095-984b-40c9995e0de5
Content-Type: application/json

--- request body ---
{"handle":"qa-fc1d28784a2a","displayName":"QA fc1d28784a2a","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-01301256-9afa-4095-984b-40c9995e0de5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 357
RateLimit-Reset: 7
Location: /v1/accounts/qa-fc1d28784a2a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_43c71bb1-7ab0-44fb-b780-23609bfc3b79","handle":"qa-fc1d28784a2a","displayName":"QA fc1d28784a2a","region":"eu","role":"user","createdAt":"2026-11-24T12:38:15.474712078Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-08fcebfb-5de8-4dd9-a37e-3408ff630193

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08fcebfb-5de8-4dd9-a37e-3408ff630193
Content-Type: application/json

--- request body ---
{"handle":"qa-3e68ed203ec8","displayName":"QA 3e68ed203ec8","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-08fcebfb-5de8-4dd9-a37e-3408ff630193
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 349
RateLimit-Reset: 7
Location: /v1/accounts/qa-3e68ed203ec8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c435c982-c517-46e0-ba4b-209893e6ad0e","handle":"qa-3e68ed203ec8","displayName":"QA 3e68ed203ec8","region":"eu","role":"user","createdAt":"2026-11-24T12:38:15.510281758Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a2af5b3a-3499-4f58-9b7d-c7b946586442

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2af5b3a-3499-4f58-9b7d-c7b946586442
Content-Type: application/json

--- request body ---
{"handle":"qa-fc1d28784a2a","password":"****"}

--- response: 200 in 50 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-a2af5b3a-3499-4f58-9b7d-c7b946586442
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 342
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_43c71bb1-7ab0-44fb-b780-23609bfc3b79"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9475459d-b532-4f55-9607-e9635cd35c1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9475459d-b532-4f55-9607-e9635cd35c1d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3e68ed203ec8","subject":"Error contract","message":"Hi"}

--- response: 201 in 35 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-9475459d-b532-4f55-9607-e9635cd35c1d
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
Location: /v1/conversations/cnv_6c740c93-aad9-482f-822d-2b2dcd1c0977
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6c740c93-aad9-482f-822d-2b2dcd1c0977","subject":"Error contract","status":"open","region":"eu","participants":["qa-fc1d28784a2a","qa-3e68ed203ec8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:15.616511006Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_6c740c93-aad9-482f-822d-2b2dcd1c0977/messages
correlation: qa-e0199dc9-323c-4b0c-813f-76aa34b6ee80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0199dc9-323c-4b0c-813f-76aa34b6ee80
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 12 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e0199dc9-323c-4b0c-813f-76aa34b6ee80
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
Content-Length: 307

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations/cnv_6c740c93-aad9-482f-822d-2b2dcd1c0977/messages","correlationId":"qa-e0199dc9-323c-4b0c-813f-76aa34b6ee80"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-94678114-abdd-46a2-8adf-95a3557c8c89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94678114-abdd-46a2-8adf-95a3557c8c89
Content-Type: application/json

--- request body ---
{"handle":"qa-3e68ed203ec8","password":"****"}

--- response: 200 in 17 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-94678114-abdd-46a2-8adf-95a3557c8c89
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 332
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c435c982-c517-46e0-ba4b-209893e6ad0e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0879a02a-17e4-4307-9aea-f4aaa93a2222

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0879a02a-17e4-4307-9aea-f4aaa93a2222
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0879a02a-17e4-4307-9aea-f4aaa93a2222
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
correlation: qa-7d18c6d4-acfc-4731-a5eb-f948169dedd0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d18c6d4-acfc-4731-a5eb-f948169dedd0
Content-Type: application/json

--- request body ---
{"handle":"qa-3e68ed203ec8","password":"****"}

--- response: 401 in 22 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7d18c6d4-acfc-4731-a5eb-f948169dedd0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 324
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7d18c6d4-acfc-4731-a5eb-f948169dedd0"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-066b1f91-5a05-46e6-82c7-50d5d3c2df85

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-066b1f91-5a05-46e6-82c7-50d5d3c2df85
Content-Type: application/json

--- response: 204 in 34 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-066b1f91-5a05-46e6-82c7-50d5d3c2df85
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
correlation: qa-700f77c2-1145-4b19-bf76-c60978a8d59e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-700f77c2-1145-4b19-bf76-c60978a8d59e
Content-Type: application/json

--- request body ---
{"handle":"qa-fc1d28784a2a","password":"****"}

--- response: 401 in 14 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-700f77c2-1145-4b19-bf76-c60978a8d59e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 318
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-700f77c2-1145-4b19-bf76-c60978a8d59e"}
```
