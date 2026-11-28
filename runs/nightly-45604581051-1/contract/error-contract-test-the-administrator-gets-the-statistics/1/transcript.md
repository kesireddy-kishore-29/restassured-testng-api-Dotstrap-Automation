# Transcript: The administrator gets the service statistics

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#theAdministratorGetsTheStatistics` |
| Features | FEAT-AUTHZ-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-b28b08bf-d764-42c5-b423-c60219ebdc02` |
| 2 | `POST /v1/accounts` | 201 | 11 | `qa-070a23f3-9210-4b70-915d-eb30d4452a3e` |
| 3 | `POST /v1/auth/token` | 200 | 7 | `qa-e99efe09-8516-4ca7-a967-bc2ae5dc97d8` |
| 4 | `POST /v1/conversations` | 201 | 7 | `qa-c6d78e07-d851-45ec-8912-eaf39053e23c` |
| 5 | `POST /v1/auth/token` | 200 | 14 | `qa-182df935-63b0-47a3-b415-8ba4f196fa80` |
| 6 | `GET /v1/admin/stats` | 200 | 10 | `qa-ed11b1b5-0dbf-49eb-835b-7aaa3538f67e` |
| 7 | `POST /v1/auth/token` | 200 | 10 | `qa-001796dc-d54b-4b60-845c-b979df0da3ab` |
| 8 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-a8d3014e-5803-434b-8bb8-bf84126eff3c` |
| 9 | `POST /v1/auth/token` | 401 | 6 | `qa-9952c627-4041-44bc-b2c3-b91a62914729` |
| 10 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-316b2d78-64c0-417e-8915-adfa9645da44` |
| 11 | `POST /v1/auth/token` | 401 | 10 | `qa-75965bc1-1db2-464f-8297-e24c2659a2a8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b28b08bf-d764-42c5-b423-c60219ebdc02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b28b08bf-d764-42c5-b423-c60219ebdc02
Content-Type: application/json

--- request body ---
{"handle":"qa-cff2bd203036","displayName":"QA cff2bd203036","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-b28b08bf-d764-42c5-b423-c60219ebdc02
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 299
RateLimit-Reset: 7
Location: /v1/accounts/qa-cff2bd203036
X-Served-Region: eu
Content-Length: 181

{"id":"acc_591cab26-7c60-4056-8d54-6af5fb5273c8","handle":"qa-cff2bd203036","displayName":"QA cff2bd203036","region":"eu","role":"user","createdAt":"2026-11-25T11:27:59.685476501Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-070a23f3-9210-4b70-915d-eb30d4452a3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-070a23f3-9210-4b70-915d-eb30d4452a3e
Content-Type: application/json

--- request body ---
{"handle":"qa-c818f3ab6fa6","displayName":"QA c818f3ab6fa6","password":"****","region":"eu"}

--- response: 201 in 11 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-070a23f3-9210-4b70-915d-eb30d4452a3e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 296
RateLimit-Reset: 7
Location: /v1/accounts/qa-c818f3ab6fa6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_01a64bee-fa20-4591-b757-30f26d59b687","handle":"qa-c818f3ab6fa6","displayName":"QA c818f3ab6fa6","region":"eu","role":"user","createdAt":"2026-11-25T11:27:59.707301534Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e99efe09-8516-4ca7-a967-bc2ae5dc97d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e99efe09-8516-4ca7-a967-bc2ae5dc97d8
Content-Type: application/json

--- request body ---
{"handle":"qa-cff2bd203036","password":"****"}

--- response: 200 in 7 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-e99efe09-8516-4ca7-a967-bc2ae5dc97d8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 295
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_591cab26-7c60-4056-8d54-6af5fb5273c8"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c6d78e07-d851-45ec-8912-eaf39053e23c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6d78e07-d851-45ec-8912-eaf39053e23c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c818f3ab6fa6","subject":"Error contract","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-c6d78e07-d851-45ec-8912-eaf39053e23c
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
Location: /v1/conversations/cnv_54f69f3c-0736-4651-88d6-8d77bf347038
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_54f69f3c-0736-4651-88d6-8d77bf347038","subject":"Error contract","status":"open","region":"eu","participants":["qa-cff2bd203036","qa-c818f3ab6fa6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:59.732451181Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-182df935-63b0-47a3-b415-8ba4f196fa80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-182df935-63b0-47a3-b415-8ba4f196fa80
Content-Type: application/json

--- request body ---
{"handle":"admin","password":"****"}

--- response: 200 in 14 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-182df935-63b0-47a3-b415-8ba4f196fa80
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 293
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d0b2beaa-d41f-46a6-8889-3b96c295b729"}
```

## 6. GET /v1/admin/stats

```text
#6 GET http://localhost:7070/v1/admin/stats
correlation: qa-ed11b1b5-0dbf-49eb-835b-7aaa3538f67e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed11b1b5-0dbf-49eb-835b-7aaa3538f67e
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed11b1b5-0dbf-49eb-835b-7aaa3538f67e
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
Content-Length: 46

{"accounts":7,"conversations":3,"purchases":0}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-001796dc-d54b-4b60-845c-b979df0da3ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-001796dc-d54b-4b60-845c-b979df0da3ab
Content-Type: application/json

--- request body ---
{"handle":"qa-c818f3ab6fa6","password":"****"}

--- response: 200 in 10 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-001796dc-d54b-4b60-845c-b979df0da3ab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 288
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_01a64bee-fa20-4591-b757-30f26d59b687"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a8d3014e-5803-434b-8bb8-bf84126eff3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8d3014e-5803-434b-8bb8-bf84126eff3c
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a8d3014e-5803-434b-8bb8-bf84126eff3c
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-9952c627-4041-44bc-b2c3-b91a62914729

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9952c627-4041-44bc-b2c3-b91a62914729
Content-Type: application/json

--- request body ---
{"handle":"qa-c818f3ab6fa6","password":"****"}

--- response: 401 in 6 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9952c627-4041-44bc-b2c3-b91a62914729
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 283
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9952c627-4041-44bc-b2c3-b91a62914729"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-316b2d78-64c0-417e-8915-adfa9645da44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-316b2d78-64c0-417e-8915-adfa9645da44
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-316b2d78-64c0-417e-8915-adfa9645da44
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

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-75965bc1-1db2-464f-8297-e24c2659a2a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75965bc1-1db2-464f-8297-e24c2659a2a8
Content-Type: application/json

--- request body ---
{"handle":"qa-cff2bd203036","password":"****"}

--- response: 401 in 10 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-75965bc1-1db2-464f-8297-e24c2659a2a8
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-75965bc1-1db2-464f-8297-e24c2659a2a8"}
```
