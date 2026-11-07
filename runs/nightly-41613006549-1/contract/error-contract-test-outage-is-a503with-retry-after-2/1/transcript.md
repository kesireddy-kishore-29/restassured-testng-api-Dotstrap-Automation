# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[2]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 371 | `qa-a3bc955c-ad36-429e-95ea-cea2c99e16cc` |
| 2 | `POST /v1/accounts` | 201 | 67 | `qa-9d0b7753-82b0-4ab3-9a92-4592728f4592` |
| 3 | `POST /v1/auth/token` | 200 | 44 | `qa-eb567fc7-6662-4beb-84b9-a13485125b60` |
| 4 | `POST /v1/conversations` | 201 | 53 | `qa-5eee0036-9f0a-4c75-aa36-61195fe5edff` |
| 5 | `GET /v1/accounts/me` | 503 | 15 | `qa-63017a4a-033f-40ef-ad10-e07a33e99eea` |
| 6 | `POST /v1/auth/token` | 200 | 33 | `qa-a012042e-15e6-4366-92b5-179ca4e441c7` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-a4b9d274-05af-4557-b332-91254ec00064` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-b16da3a8-6888-4048-9df7-042e973b89bd` |
| 9 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-c186a8f6-aeee-4b43-b84f-901808a41662` |
| 10 | `POST /v1/auth/token` | 401 | 27 | `qa-8ca93c13-1c46-4db9-b3e3-87d48f8f7a6d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a3bc955c-ad36-429e-95ea-cea2c99e16cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3bc955c-ad36-429e-95ea-cea2c99e16cc
Content-Type: application/json

--- request body ---
{"handle":"qa-c9241a388272","displayName":"QA c9241a388272","password":"****","region":"eu"}

--- response: 201 in 371 ms ---
Date: Tue, 03 Nov 2026 09:41:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-a3bc955c-ad36-429e-95ea-cea2c99e16cc
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
Location: /v1/accounts/qa-c9241a388272
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f8dda546-620d-4a69-9dda-cc461594de3a","handle":"qa-c9241a388272","displayName":"QA c9241a388272","region":"eu","role":"user","createdAt":"2026-11-03T09:41:30.835776159Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9d0b7753-82b0-4ab3-9a92-4592728f4592

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d0b7753-82b0-4ab3-9a92-4592728f4592
Content-Type: application/json

--- request body ---
{"handle":"qa-f5fae29c1825","displayName":"QA f5fae29c1825","password":"****","region":"eu"}

--- response: 201 in 67 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d0b7753-82b0-4ab3-9a92-4592728f4592
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 10
Location: /v1/accounts/qa-f5fae29c1825
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8cb45dce-e918-4272-bc2d-e1568cac869f","handle":"qa-f5fae29c1825","displayName":"QA f5fae29c1825","region":"eu","role":"user","createdAt":"2026-11-03T09:41:31.243994653Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-eb567fc7-6662-4beb-84b9-a13485125b60

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb567fc7-6662-4beb-84b9-a13485125b60
Content-Type: application/json

--- request body ---
{"handle":"qa-c9241a388272","password":"****"}

--- response: 200 in 44 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb567fc7-6662-4beb-84b9-a13485125b60
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f8dda546-620d-4a69-9dda-cc461594de3a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5eee0036-9f0a-4c75-aa36-61195fe5edff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5eee0036-9f0a-4c75-aa36-61195fe5edff
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f5fae29c1825","subject":"Error contract","message":"Hi"}

--- response: 201 in 53 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-5eee0036-9f0a-4c75-aa36-61195fe5edff
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
Location: /v1/conversations/cnv_bac95d49-544b-47af-b615-79a12c458e6d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_bac95d49-544b-47af-b615-79a12c458e6d","subject":"Error contract","status":"open","region":"eu","participants":["qa-c9241a388272","qa-f5fae29c1825"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:31.404883368Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-63017a4a-033f-40ef-ad10-e07a33e99eea

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 227b5d46-06ed-4d66-b89e-ed0f8199f976
X-Correlation-Id: qa-63017a4a-033f-40ef-ad10-e07a33e99eea
Content-Type: application/json

--- response: 503 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-63017a4a-033f-40ef-ad10-e07a33e99eea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-63017a4a-033f-40ef-ad10-e07a33e99eea"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a012042e-15e6-4366-92b5-179ca4e441c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a012042e-15e6-4366-92b5-179ca4e441c7
Content-Type: application/json

--- request body ---
{"handle":"qa-f5fae29c1825","password":"****"}

--- response: 200 in 33 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-a012042e-15e6-4366-92b5-179ca4e441c7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 540
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8cb45dce-e918-4272-bc2d-e1568cac869f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a4b9d274-05af-4557-b332-91254ec00064

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4b9d274-05af-4557-b332-91254ec00064
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a4b9d274-05af-4557-b332-91254ec00064
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
correlation: qa-b16da3a8-6888-4048-9df7-042e973b89bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b16da3a8-6888-4048-9df7-042e973b89bd
Content-Type: application/json

--- request body ---
{"handle":"qa-f5fae29c1825","password":"****"}

--- response: 401 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b16da3a8-6888-4048-9df7-042e973b89bd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 531
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b16da3a8-6888-4048-9df7-042e973b89bd"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c186a8f6-aeee-4b43-b84f-901808a41662

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c186a8f6-aeee-4b43-b84f-901808a41662
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c186a8f6-aeee-4b43-b84f-901808a41662
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
correlation: qa-8ca93c13-1c46-4db9-b3e3-87d48f8f7a6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ca93c13-1c46-4db9-b3e3-87d48f8f7a6d
Content-Type: application/json

--- request body ---
{"handle":"qa-c9241a388272","password":"****"}

--- response: 401 in 27 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8ca93c13-1c46-4db9-b3e3-87d48f8f7a6d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 520
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8ca93c13-1c46-4db9-b3e3-87d48f8f7a6d"}
```
