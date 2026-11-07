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
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-c32b26dc-3896-4157-bbd7-4ab57a738be3` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-19417b77-959e-4a5e-b712-d840ee496e00` |
| 3 | `POST /v1/auth/token` | 200 | 17 | `qa-f5a7cd77-85a0-4309-9c62-23e198514b20` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-0c97316c-49bf-479f-9961-2b2ee3cb2d86` |
| 5 | `POST /v1/auth/token` | 200 | 18 | `qa-19560eb9-c3d8-404f-a9f6-6e0d0d2d4ff2` |
| 6 | `GET /v1/admin/stats` | 200 | 18 | `qa-0ecb7c96-2be0-4db7-a158-88ca334a5cc6` |
| 7 | `POST /v1/auth/token` | 200 | 20 | `qa-45ec9255-1567-48b6-b6ca-b71e3c2d56eb` |
| 8 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-ff82fc87-c276-47bf-8f01-42dc69d078b1` |
| 9 | `POST /v1/auth/token` | 401 | 10 | `qa-7137b123-a40c-4601-b476-7d7b49871901` |
| 10 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-e65f6c4b-5c42-45ef-93d1-329aa389049c` |
| 11 | `POST /v1/auth/token` | 401 | 7 | `qa-8c31cc77-5b66-4d01-b00b-04d27a88dac5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c32b26dc-3896-4157-bbd7-4ab57a738be3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c32b26dc-3896-4157-bbd7-4ab57a738be3
Content-Type: application/json

--- request body ---
{"handle":"qa-1403185fd95e","displayName":"QA 1403185fd95e","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-c32b26dc-3896-4157-bbd7-4ab57a738be3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 317
RateLimit-Reset: 7
Location: /v1/accounts/qa-1403185fd95e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e6aa89fe-a4fe-4df7-86cf-d2a49520e4f9","handle":"qa-1403185fd95e","displayName":"QA 1403185fd95e","region":"eu","role":"user","createdAt":"2026-11-02T09:38:37.854823694Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-19417b77-959e-4a5e-b712-d840ee496e00

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19417b77-959e-4a5e-b712-d840ee496e00
Content-Type: application/json

--- request body ---
{"handle":"qa-c0e7e171545c","displayName":"QA c0e7e171545c","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-19417b77-959e-4a5e-b712-d840ee496e00
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 315
RateLimit-Reset: 7
Location: /v1/accounts/qa-c0e7e171545c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4ed727e2-803c-4b52-8454-6301b0401f3a","handle":"qa-c0e7e171545c","displayName":"QA c0e7e171545c","region":"eu","role":"user","createdAt":"2026-11-02T09:38:37.893699289Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f5a7cd77-85a0-4309-9c62-23e198514b20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5a7cd77-85a0-4309-9c62-23e198514b20
Content-Type: application/json

--- request body ---
{"handle":"qa-1403185fd95e","password":"****"}

--- response: 200 in 17 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5a7cd77-85a0-4309-9c62-23e198514b20
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 313
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e6aa89fe-a4fe-4df7-86cf-d2a49520e4f9"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0c97316c-49bf-479f-9961-2b2ee3cb2d86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c97316c-49bf-479f-9961-2b2ee3cb2d86
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c0e7e171545c","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-0c97316c-49bf-479f-9961-2b2ee3cb2d86
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
Location: /v1/conversations/cnv_23109cf5-9100-4ffb-925b-f08f699ad2e7
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_23109cf5-9100-4ffb-925b-f08f699ad2e7","subject":"Error contract","status":"open","region":"eu","participants":["qa-1403185fd95e","qa-c0e7e171545c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:37.939059226Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-19560eb9-c3d8-404f-a9f6-6e0d0d2d4ff2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19560eb9-c3d8-404f-a9f6-6e0d0d2d4ff2
Content-Type: application/json

--- request body ---
{"handle":"admin","password":"****"}

--- response: 200 in 18 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-19560eb9-c3d8-404f-a9f6-6e0d0d2d4ff2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 306
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c045ac43-3f3e-42f6-82e5-e8c622226b99"}
```

## 6. GET /v1/admin/stats

```text
#6 GET http://localhost:7070/v1/admin/stats
correlation: qa-0ecb7c96-2be0-4db7-a158-88ca334a5cc6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ecb7c96-2be0-4db7-a158-88ca334a5cc6
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ecb7c96-2be0-4db7-a158-88ca334a5cc6
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
Content-Length: 47

{"accounts":10,"conversations":2,"purchases":0}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-45ec9255-1567-48b6-b6ca-b71e3c2d56eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45ec9255-1567-48b6-b6ca-b71e3c2d56eb
Content-Type: application/json

--- request body ---
{"handle":"qa-c0e7e171545c","password":"****"}

--- response: 200 in 20 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-45ec9255-1567-48b6-b6ca-b71e3c2d56eb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 298
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4ed727e2-803c-4b52-8454-6301b0401f3a"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ff82fc87-c276-47bf-8f01-42dc69d078b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff82fc87-c276-47bf-8f01-42dc69d078b1
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ff82fc87-c276-47bf-8f01-42dc69d078b1
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
correlation: qa-7137b123-a40c-4601-b476-7d7b49871901

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7137b123-a40c-4601-b476-7d7b49871901
Content-Type: application/json

--- request body ---
{"handle":"qa-c0e7e171545c","password":"****"}

--- response: 401 in 10 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7137b123-a40c-4601-b476-7d7b49871901
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 294
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7137b123-a40c-4601-b476-7d7b49871901"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e65f6c4b-5c42-45ef-93d1-329aa389049c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e65f6c4b-5c42-45ef-93d1-329aa389049c
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e65f6c4b-5c42-45ef-93d1-329aa389049c
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
correlation: qa-8c31cc77-5b66-4d01-b00b-04d27a88dac5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c31cc77-5b66-4d01-b00b-04d27a88dac5
Content-Type: application/json

--- request body ---
{"handle":"qa-1403185fd95e","password":"****"}

--- response: 401 in 7 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8c31cc77-5b66-4d01-b00b-04d27a88dac5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 292
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8c31cc77-5b66-4d01-b00b-04d27a88dac5"}
```
