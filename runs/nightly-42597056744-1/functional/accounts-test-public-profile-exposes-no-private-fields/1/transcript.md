# Transcript: Anyone signed in sees a public profile with no private fields

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.AccountsTest#publicProfileExposesNoPrivateFields` |
| Features | FEAT-ACCT-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-ea377b6f-c8fa-4f6d-8cb5-0bfc873f3528` |
| 2 | `POST /v1/accounts` | 201 | 19 | `qa-78d6a253-3622-42b6-8848-3847617329b8` |
| 3 | `POST /v1/auth/token` | 200 | 22 | `qa-92fb0115-0577-49fb-a930-d7c0623a64b7` |
| 4 | `GET /v1/accounts/{handle}` | 200 | 15 | `qa-1d41b432-8c7a-4c16-8688-d1e933617bac` |
| 5 | `GET /v1/accounts/{handle}` | 200 | 7 | `qa-800cde8a-3239-4839-ba94-d8d6f37b9c35` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 7 | `qa-241f6e10-e375-4f61-8811-9dc06bc12e89` |
| 7 | `POST /v1/auth/token` | 200 | 15 | `qa-188b58c5-a08c-464b-9fcb-0dc3ea3a52eb` |
| 8 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-ad9a42d5-ede1-43d6-a72f-c4d6536d6eb2` |
| 9 | `POST /v1/auth/token` | 401 | 12 | `qa-91143e20-7fde-4456-90a0-3bf8b1b4b996` |
| 10 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-265f110f-fb1e-4c96-af76-dc6d2918d3c2` |
| 11 | `POST /v1/auth/token` | 401 | 13 | `qa-764998ac-f6ed-4ba6-bd72-9d5a8c896b84` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ea377b6f-c8fa-4f6d-8cb5-0bfc873f3528

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea377b6f-c8fa-4f6d-8cb5-0bfc873f3528
Content-Type: application/json

--- request body ---
{"handle":"qa-c0e436afbba4","displayName":"QA c0e436afbba4","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-ea377b6f-c8fa-4f6d-8cb5-0bfc873f3528
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Location: /v1/accounts/qa-c0e436afbba4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_56f19f6c-3bf3-45e7-98ad-f9bbbe210319","handle":"qa-c0e436afbba4","displayName":"QA c0e436afbba4","region":"eu","role":"user","createdAt":"2026-11-09T09:56:00.017160141Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-78d6a253-3622-42b6-8848-3847617329b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78d6a253-3622-42b6-8848-3847617329b8
Content-Type: application/json

--- request body ---
{"handle":"qa-a8b6e42e256f","displayName":"QA a8b6e42e256f","password":"****","region":"us"}

--- response: 201 in 19 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-78d6a253-3622-42b6-8848-3847617329b8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Location: /v1/accounts/qa-a8b6e42e256f
X-Served-Region: us
Content-Length: 181

{"id":"acc_7fbf48d0-93b4-47b4-959f-e78609e31827","handle":"qa-a8b6e42e256f","displayName":"QA a8b6e42e256f","region":"us","role":"user","createdAt":"2026-11-09T09:56:00.053932422Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-92fb0115-0577-49fb-a930-d7c0623a64b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92fb0115-0577-49fb-a930-d7c0623a64b7
Content-Type: application/json

--- request body ---
{"handle":"qa-c0e436afbba4","password":"****"}

--- response: 200 in 22 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-92fb0115-0577-49fb-a930-d7c0623a64b7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_56f19f6c-3bf3-45e7-98ad-f9bbbe210319"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-a8b6e42e256f
correlation: qa-1d41b432-8c7a-4c16-8688-d1e933617bac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d41b432-8c7a-4c16-8688-d1e933617bac
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d41b432-8c7a-4c16-8688-d1e933617bac
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
Content-Length: 74

{"handle":"qa-a8b6e42e256f","displayName":"QA a8b6e42e256f","region":"us"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-a8b6e42e256f
correlation: qa-800cde8a-3239-4839-ba94-d8d6f37b9c35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-800cde8a-3239-4839-ba94-d8d6f37b9c35
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-800cde8a-3239-4839-ba94-d8d6f37b9c35
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
Content-Length: 74

{"handle":"qa-a8b6e42e256f","displayName":"QA a8b6e42e256f","region":"us"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-a8b6e42e256f
correlation: qa-241f6e10-e375-4f61-8811-9dc06bc12e89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-241f6e10-e375-4f61-8811-9dc06bc12e89
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-241f6e10-e375-4f61-8811-9dc06bc12e89
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

{"handle":"qa-a8b6e42e256f","displayName":"QA a8b6e42e256f","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-188b58c5-a08c-464b-9fcb-0dc3ea3a52eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-188b58c5-a08c-464b-9fcb-0dc3ea3a52eb
Content-Type: application/json

--- request body ---
{"handle":"qa-a8b6e42e256f","password":"****"}

--- response: 200 in 15 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-188b58c5-a08c-464b-9fcb-0dc3ea3a52eb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7fbf48d0-93b4-47b4-959f-e78609e31827"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ad9a42d5-ede1-43d6-a72f-c4d6536d6eb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad9a42d5-ede1-43d6-a72f-c4d6536d6eb2
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ad9a42d5-ede1-43d6-a72f-c4d6536d6eb2
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
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-91143e20-7fde-4456-90a0-3bf8b1b4b996

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91143e20-7fde-4456-90a0-3bf8b1b4b996
Content-Type: application/json

--- request body ---
{"handle":"qa-a8b6e42e256f","password":"****"}

--- response: 401 in 12 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-91143e20-7fde-4456-90a0-3bf8b1b4b996
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-91143e20-7fde-4456-90a0-3bf8b1b4b996"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-265f110f-fb1e-4c96-af76-dc6d2918d3c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-265f110f-fb1e-4c96-af76-dc6d2918d3c2
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-265f110f-fb1e-4c96-af76-dc6d2918d3c2
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
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-764998ac-f6ed-4ba6-bd72-9d5a8c896b84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-764998ac-f6ed-4ba6-bd72-9d5a8c896b84
Content-Type: application/json

--- request body ---
{"handle":"qa-c0e436afbba4","password":"****"}

--- response: 401 in 13 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-764998ac-f6ed-4ba6-bd72-9d5a8c896b84
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-764998ac-f6ed-4ba6-bd72-9d5a8c896b84"}
```
