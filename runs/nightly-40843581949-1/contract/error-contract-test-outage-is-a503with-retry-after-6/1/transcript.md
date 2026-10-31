# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[6]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 38 | `qa-f1b1fd0d-c29d-44d2-b3f5-f6b7cacfde3d` |
| 2 | `POST /v1/accounts` | 201 | 51 | `qa-9071f15a-5786-4cd4-9393-9c452d099ce1` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-e8e020f0-827e-480d-b55d-ff2d70b5b589` |
| 4 | `POST /v1/conversations` | 201 | 26 | `qa-0b636790-bbba-4ea0-b14e-61ddd9a32c07` |
| 5 | `POST /v1/conversations` | 503 | 27 | `qa-a86c3c13-39c1-45ba-b67b-017eb1fe396b` |
| 6 | `POST /v1/auth/token` | 200 | 49 | `qa-b50ddb88-be50-4dbb-a2b7-f7f1c09a029d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 53 | `qa-7e9bfa6b-e51f-40ef-90de-df3addfba5ef` |
| 8 | `POST /v1/auth/token` | 401 | 27 | `qa-5a82cc16-1a7d-4183-a676-6b5a9e54db5b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 35 | `qa-41a225ca-8e28-4468-be12-67683fad3794` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-7516d725-7252-48cc-a1a4-fda576812f4d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f1b1fd0d-c29d-44d2-b3f5-f6b7cacfde3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1b1fd0d-c29d-44d2-b3f5-f6b7cacfde3d
Content-Type: application/json

--- request body ---
{"handle":"qa-65ba788a8b0f","displayName":"QA 65ba788a8b0f","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1b1fd0d-c29d-44d2-b3f5-f6b7cacfde3d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 501
RateLimit-Reset: 8
Location: /v1/accounts/qa-65ba788a8b0f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4bd3e7eb-6c5f-4693-99e5-437660ef254d","handle":"qa-65ba788a8b0f","displayName":"QA 65ba788a8b0f","region":"eu","role":"user","createdAt":"2026-10-29T08:38:59.761816440Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9071f15a-5786-4cd4-9393-9c452d099ce1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9071f15a-5786-4cd4-9393-9c452d099ce1
Content-Type: application/json

--- request body ---
{"handle":"qa-921ed8f0cd2b","displayName":"QA 921ed8f0cd2b","password":"****","region":"eu"}

--- response: 201 in 51 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-9071f15a-5786-4cd4-9393-9c452d099ce1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 492
RateLimit-Reset: 8
Location: /v1/accounts/qa-921ed8f0cd2b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_30e81044-3c24-4c35-a5ca-2c7dc8fa862f","handle":"qa-921ed8f0cd2b","displayName":"QA 921ed8f0cd2b","region":"eu","role":"user","createdAt":"2026-10-29T08:38:59.819112044Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e8e020f0-827e-480d-b55d-ff2d70b5b589

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8e020f0-827e-480d-b55d-ff2d70b5b589
Content-Type: application/json

--- request body ---
{"handle":"qa-65ba788a8b0f","password":"****"}

--- response: 200 in 26 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8e020f0-827e-480d-b55d-ff2d70b5b589
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 480
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4bd3e7eb-6c5f-4693-99e5-437660ef254d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0b636790-bbba-4ea0-b14e-61ddd9a32c07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b636790-bbba-4ea0-b14e-61ddd9a32c07
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-921ed8f0cd2b","subject":"Error contract","message":"Hi"}

--- response: 201 in 26 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b636790-bbba-4ea0-b14e-61ddd9a32c07
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
Location: /v1/conversations/cnv_a2d70c90-199c-4356-8a02-485d1ae66b00
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a2d70c90-199c-4356-8a02-485d1ae66b00","subject":"Error contract","status":"open","region":"eu","participants":["qa-65ba788a8b0f","qa-921ed8f0cd2b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:38:59.960574008Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-a86c3c13-39c1-45ba-b67b-017eb1fe396b

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: e472c812-cb58-49b1-be8b-1c9a23d89a6d
X-Correlation-Id: qa-a86c3c13-39c1-45ba-b67b-017eb1fe396b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-65ba788a8b0f","subject":"Probe","message":"Hi"}

--- response: 503 in 27 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a86c3c13-39c1-45ba-b67b-017eb1fe396b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-a86c3c13-39c1-45ba-b67b-017eb1fe396b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b50ddb88-be50-4dbb-a2b7-f7f1c09a029d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b50ddb88-be50-4dbb-a2b7-f7f1c09a029d
Content-Type: application/json

--- request body ---
{"handle":"qa-921ed8f0cd2b","password":"****"}

--- response: 200 in 49 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-b50ddb88-be50-4dbb-a2b7-f7f1c09a029d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 466
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_30e81044-3c24-4c35-a5ca-2c7dc8fa862f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7e9bfa6b-e51f-40ef-90de-df3addfba5ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e9bfa6b-e51f-40ef-90de-df3addfba5ef
Content-Type: application/json

--- response: 204 in 53 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7e9bfa6b-e51f-40ef-90de-df3addfba5ef
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
correlation: qa-5a82cc16-1a7d-4183-a676-6b5a9e54db5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a82cc16-1a7d-4183-a676-6b5a9e54db5b
Content-Type: application/json

--- request body ---
{"handle":"qa-921ed8f0cd2b","password":"****"}

--- response: 401 in 27 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5a82cc16-1a7d-4183-a676-6b5a9e54db5b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 458
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5a82cc16-1a7d-4183-a676-6b5a9e54db5b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-41a225ca-8e28-4468-be12-67683fad3794

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41a225ca-8e28-4468-be12-67683fad3794
Content-Type: application/json

--- response: 204 in 35 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-41a225ca-8e28-4468-be12-67683fad3794
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
correlation: qa-7516d725-7252-48cc-a1a4-fda576812f4d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7516d725-7252-48cc-a1a4-fda576812f4d
Content-Type: application/json

--- request body ---
{"handle":"qa-65ba788a8b0f","password":"****"}

--- response: 401 in 15 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7516d725-7252-48cc-a1a4-fda576812f4d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 448
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7516d725-7252-48cc-a1a4-fda576812f4d"}
```
