# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[8]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-b1196a91-964d-4aeb-a8a3-d2230114862c` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-b0fd604d-30f6-4f68-8bd5-b61014f87fcd` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-6a5f9f0a-dd83-4583-bd4a-32a21bd61313` |
| 4 | `POST /v1/conversations` | 201 | 28 | `qa-85c90865-dfa6-49ec-b18b-718e4f237f4e` |
| 5 | `GET /v1/conversations/{id}` | 503 | 25 | `qa-23b0b385-ef81-4f85-9ff5-702b127e5464` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-b45f9b36-3abb-4ef0-8ff9-dcf510be2201` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-f0f2d643-697c-47a9-abd1-9e36113c9316` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-5efb0b54-87d3-4cdf-9748-35db55743938` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-69e99838-951b-4d3f-8680-79eeac794097` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-f9eb2320-487f-43a6-80ee-2222cd06117c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b1196a91-964d-4aeb-a8a3-d2230114862c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1196a91-964d-4aeb-a8a3-d2230114862c
Content-Type: application/json

--- request body ---
{"handle":"qa-940afe7141ed","displayName":"QA 940afe7141ed","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-b1196a91-964d-4aeb-a8a3-d2230114862c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 414
RateLimit-Reset: 8
Location: /v1/accounts/qa-940afe7141ed
X-Served-Region: eu
Content-Length: 181

{"id":"acc_92bbda21-0c99-438e-9e49-21ab5bbf324f","handle":"qa-940afe7141ed","displayName":"QA 940afe7141ed","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.311355342Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b0fd604d-30f6-4f68-8bd5-b61014f87fcd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0fd604d-30f6-4f68-8bd5-b61014f87fcd
Content-Type: application/json

--- request body ---
{"handle":"qa-c332daefb8ca","displayName":"QA c332daefb8ca","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0fd604d-30f6-4f68-8bd5-b61014f87fcd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 407
RateLimit-Reset: 8
Location: /v1/accounts/qa-c332daefb8ca
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3525c67f-81c5-4fbb-88fe-97b8543db598","handle":"qa-c332daefb8ca","displayName":"QA c332daefb8ca","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.368143166Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6a5f9f0a-dd83-4583-bd4a-32a21bd61313

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a5f9f0a-dd83-4583-bd4a-32a21bd61313
Content-Type: application/json

--- request body ---
{"handle":"qa-940afe7141ed","password":"****"}

--- response: 200 in 25 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a5f9f0a-dd83-4583-bd4a-32a21bd61313
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 400
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_92bbda21-0c99-438e-9e49-21ab5bbf324f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-85c90865-dfa6-49ec-b18b-718e4f237f4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85c90865-dfa6-49ec-b18b-718e4f237f4e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c332daefb8ca","subject":"Error contract","message":"Hi"}

--- response: 201 in 28 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-85c90865-dfa6-49ec-b18b-718e4f237f4e
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
Location: /v1/conversations/cnv_7e979b3a-c9cc-488c-9a98-6f206bec02e5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7e979b3a-c9cc-488c-9a98-6f206bec02e5","subject":"Error contract","status":"open","region":"eu","participants":["qa-940afe7141ed","qa-c332daefb8ca"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:54:59.456268794Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_7e979b3a-c9cc-488c-9a98-6f206bec02e5
correlation: qa-23b0b385-ef81-4f85-9ff5-702b127e5464

--- request headers ---
Accept: application/json
X-Fault-Key: 23b9f240-8138-400f-a418-05b8351b38f6
X-Fault: unavailable-once
X-Correlation-Id: qa-23b0b385-ef81-4f85-9ff5-702b127e5464
Content-Type: application/json

--- response: 503 in 25 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-23b0b385-ef81-4f85-9ff5-702b127e5464
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 302

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_7e979b3a-c9cc-488c-9a98-6f206bec02e5","correlationId":"qa-23b0b385-ef81-4f85-9ff5-702b127e5464"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b45f9b36-3abb-4ef0-8ff9-dcf510be2201

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b45f9b36-3abb-4ef0-8ff9-dcf510be2201
Content-Type: application/json

--- request body ---
{"handle":"qa-c332daefb8ca","password":"****"}

--- response: 200 in 24 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-b45f9b36-3abb-4ef0-8ff9-dcf510be2201
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 384
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3525c67f-81c5-4fbb-88fe-97b8543db598"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f0f2d643-697c-47a9-abd1-9e36113c9316

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0f2d643-697c-47a9-abd1-9e36113c9316
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f0f2d643-697c-47a9-abd1-9e36113c9316
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
correlation: qa-5efb0b54-87d3-4cdf-9748-35db55743938

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5efb0b54-87d3-4cdf-9748-35db55743938
Content-Type: application/json

--- request body ---
{"handle":"qa-c332daefb8ca","password":"****"}

--- response: 401 in 10 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5efb0b54-87d3-4cdf-9748-35db55743938
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5efb0b54-87d3-4cdf-9748-35db55743938"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-69e99838-951b-4d3f-8680-79eeac794097

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69e99838-951b-4d3f-8680-79eeac794097
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-69e99838-951b-4d3f-8680-79eeac794097
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
correlation: qa-f9eb2320-487f-43a6-80ee-2222cd06117c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9eb2320-487f-43a6-80ee-2222cd06117c
Content-Type: application/json

--- request body ---
{"handle":"qa-940afe7141ed","password":"****"}

--- response: 401 in 12 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f9eb2320-487f-43a6-80ee-2222cd06117c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 371
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f9eb2320-487f-43a6-80ee-2222cd06117c"}
```
