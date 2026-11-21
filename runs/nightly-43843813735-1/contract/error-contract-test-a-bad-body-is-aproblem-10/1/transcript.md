# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[10]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 38 | `qa-23c13557-938e-41fc-b2c7-b29411cdefb1` |
| 2 | `POST /v1/accounts` | 201 | 35 | `qa-8f1b59d7-eed3-478d-a900-bce9131cb1ba` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-12b14e93-a5b8-4c4b-93c1-247872a72ba5` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-650c5e3c-a7cb-4eaa-8fce-50ec55bd2242` |
| 5 | `POST /v1/conversations` | 415 | 16 | `qa-ba77c453-cbcf-4a8c-8ccb-507c5ee3672b` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-51f64d06-9a1d-4f8e-bba1-825748eb28a1` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-b6affe16-a4e6-469d-a899-69a7384c1ad5` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-0690c8fe-c5ee-4e44-ac23-e00e7d84b695` |
| 9 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-40384954-fef0-455e-ba6b-30911a57e02a` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-d47f818a-2642-4dad-b209-2c896165a9e3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-23c13557-938e-41fc-b2c7-b29411cdefb1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23c13557-938e-41fc-b2c7-b29411cdefb1
Content-Type: application/json

--- request body ---
{"handle":"qa-dc0f4ca28e21","displayName":"QA dc0f4ca28e21","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-23c13557-938e-41fc-b2c7-b29411cdefb1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 406
RateLimit-Reset: 8
Location: /v1/accounts/qa-dc0f4ca28e21
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0e8ee184-a2c6-4695-8102-a0128f127587","handle":"qa-dc0f4ca28e21","displayName":"QA dc0f4ca28e21","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.701967236Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8f1b59d7-eed3-478d-a900-bce9131cb1ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f1b59d7-eed3-478d-a900-bce9131cb1ba
Content-Type: application/json

--- request body ---
{"handle":"qa-8995accdb573","displayName":"QA 8995accdb573","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f1b59d7-eed3-478d-a900-bce9131cb1ba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 396
RateLimit-Reset: 8
Location: /v1/accounts/qa-8995accdb573
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d77ffaa9-54bb-40ba-859b-d2e27ee67b50","handle":"qa-8995accdb573","displayName":"QA 8995accdb573","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.752558738Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-12b14e93-a5b8-4c4b-93c1-247872a72ba5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12b14e93-a5b8-4c4b-93c1-247872a72ba5
Content-Type: application/json

--- request body ---
{"handle":"qa-dc0f4ca28e21","password":"****"}

--- response: 200 in 25 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-12b14e93-a5b8-4c4b-93c1-247872a72ba5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 391
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0e8ee184-a2c6-4695-8102-a0128f127587"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-650c5e3c-a7cb-4eaa-8fce-50ec55bd2242

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-650c5e3c-a7cb-4eaa-8fce-50ec55bd2242
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8995accdb573","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-650c5e3c-a7cb-4eaa-8fce-50ec55bd2242
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
Location: /v1/conversations/cnv_7af7fd8a-5bc4-491b-9d90-e75e154b1bf5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7af7fd8a-5bc4-491b-9d90-e75e154b1bf5","subject":"Error contract","status":"open","region":"eu","participants":["qa-dc0f4ca28e21","qa-8995accdb573"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:53.823045184Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-ba77c453-cbcf-4a8c-8ccb-507c5ee3672b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba77c453-cbcf-4a8c-8ccb-507c5ee3672b
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 16 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ba77c453-cbcf-4a8c-8ccb-507c5ee3672b
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
Content-Length: 257

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations","correlationId":"qa-ba77c453-cbcf-4a8c-8ccb-507c5ee3672b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-51f64d06-9a1d-4f8e-bba1-825748eb28a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51f64d06-9a1d-4f8e-bba1-825748eb28a1
Content-Type: application/json

--- request body ---
{"handle":"qa-8995accdb573","password":"****"}

--- response: 200 in 27 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-51f64d06-9a1d-4f8e-bba1-825748eb28a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 377
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d77ffaa9-54bb-40ba-859b-d2e27ee67b50"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b6affe16-a4e6-469d-a899-69a7384c1ad5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6affe16-a4e6-469d-a899-69a7384c1ad5
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b6affe16-a4e6-469d-a899-69a7384c1ad5
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
correlation: qa-0690c8fe-c5ee-4e44-ac23-e00e7d84b695

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0690c8fe-c5ee-4e44-ac23-e00e7d84b695
Content-Type: application/json

--- request body ---
{"handle":"qa-8995accdb573","password":"****"}

--- response: 401 in 14 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0690c8fe-c5ee-4e44-ac23-e00e7d84b695
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 370
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0690c8fe-c5ee-4e44-ac23-e00e7d84b695"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-40384954-fef0-455e-ba6b-30911a57e02a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40384954-fef0-455e-ba6b-30911a57e02a
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-40384954-fef0-455e-ba6b-30911a57e02a
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
correlation: qa-d47f818a-2642-4dad-b209-2c896165a9e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d47f818a-2642-4dad-b209-2c896165a9e3
Content-Type: application/json

--- request body ---
{"handle":"qa-dc0f4ca28e21","password":"****"}

--- response: 401 in 15 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d47f818a-2642-4dad-b209-2c896165a9e3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 362
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d47f818a-2642-4dad-b209-2c896165a9e3"}
```
