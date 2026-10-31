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
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-d5356de4-6193-4d23-8f6e-0e9388e2343f` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-7bf80559-64c0-49aa-95ec-a8e288446364` |
| 3 | `POST /v1/auth/token` | 200 | 13 | `qa-96cbd64f-4b6d-429b-a69f-48f916ec00ab` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-798811d8-767b-4eed-a377-df947845bc16` |
| 5 | `POST /v1/auth/token` | 200 | 27 | `qa-a4985514-f7de-449f-85e3-8c1ca656e555` |
| 6 | `GET /v1/admin/stats` | 200 | 42 | `qa-f1f42e4f-6577-4930-8837-697e5a654b22` |
| 7 | `POST /v1/auth/token` | 200 | 24 | `qa-0d5deebe-73c6-406f-90e4-f3096c8b6ba2` |
| 8 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-58f29adc-4a13-4f12-9e45-b9fedc82fb5d` |
| 9 | `POST /v1/auth/token` | 401 | 6 | `qa-19e3fbdd-1726-427c-93bb-acc400100c26` |
| 10 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-08ac8c00-5fd8-42ac-99a1-751af6bd47c7` |
| 11 | `POST /v1/auth/token` | 401 | 10 | `qa-824b5638-1407-4c52-b0ad-338774178a82` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d5356de4-6193-4d23-8f6e-0e9388e2343f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5356de4-6193-4d23-8f6e-0e9388e2343f
Content-Type: application/json

--- request body ---
{"handle":"qa-9e6cdf22a900","displayName":"QA 9e6cdf22a900","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5356de4-6193-4d23-8f6e-0e9388e2343f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 318
RateLimit-Reset: 6
Location: /v1/accounts/qa-9e6cdf22a900
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e4134ca7-851b-42aa-a6a4-6bc2cb9c8cb8","handle":"qa-9e6cdf22a900","displayName":"QA 9e6cdf22a900","region":"eu","role":"user","createdAt":"2026-10-30T08:46:05.998876778Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7bf80559-64c0-49aa-95ec-a8e288446364

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7bf80559-64c0-49aa-95ec-a8e288446364
Content-Type: application/json

--- request body ---
{"handle":"qa-17a59f284d24","displayName":"QA 17a59f284d24","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-7bf80559-64c0-49aa-95ec-a8e288446364
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 316
RateLimit-Reset: 6
Location: /v1/accounts/qa-17a59f284d24
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2d0e9e6f-b8d6-4289-85f3-7ab386fcd8f9","handle":"qa-17a59f284d24","displayName":"QA 17a59f284d24","region":"eu","role":"user","createdAt":"2026-10-30T08:46:06.020675062Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-96cbd64f-4b6d-429b-a69f-48f916ec00ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96cbd64f-4b6d-429b-a69f-48f916ec00ab
Content-Type: application/json

--- request body ---
{"handle":"qa-9e6cdf22a900","password":"****"}

--- response: 200 in 13 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-96cbd64f-4b6d-429b-a69f-48f916ec00ab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 313
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e4134ca7-851b-42aa-a6a4-6bc2cb9c8cb8"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-798811d8-767b-4eed-a377-df947845bc16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-798811d8-767b-4eed-a377-df947845bc16
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-17a59f284d24","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-798811d8-767b-4eed-a377-df947845bc16
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
Location: /v1/conversations/cnv_daedfff5-f236-4532-9564-ae87bdea24b6
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_daedfff5-f236-4532-9564-ae87bdea24b6","subject":"Error contract","status":"open","region":"eu","participants":["qa-9e6cdf22a900","qa-17a59f284d24"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:06.073176439Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-a4985514-f7de-449f-85e3-8c1ca656e555

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4985514-f7de-449f-85e3-8c1ca656e555
Content-Type: application/json

--- request body ---
{"handle":"admin","password":"****"}

--- response: 200 in 27 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-a4985514-f7de-449f-85e3-8c1ca656e555
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 311
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_96aaf05d-29c9-48d8-bc10-ab127aec40cb"}
```

## 6. GET /v1/admin/stats

```text
#6 GET http://localhost:7070/v1/admin/stats
correlation: qa-f1f42e4f-6577-4930-8837-697e5a654b22

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1f42e4f-6577-4930-8837-697e5a654b22
Content-Type: application/json

--- response: 200 in 42 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1f42e4f-6577-4930-8837-697e5a654b22
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

{"accounts":9,"conversations":2,"purchases":0}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-0d5deebe-73c6-406f-90e4-f3096c8b6ba2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d5deebe-73c6-406f-90e4-f3096c8b6ba2
Content-Type: application/json

--- request body ---
{"handle":"qa-17a59f284d24","password":"****"}

--- response: 200 in 24 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d5deebe-73c6-406f-90e4-f3096c8b6ba2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 300
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2d0e9e6f-b8d6-4289-85f3-7ab386fcd8f9"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-58f29adc-4a13-4f12-9e45-b9fedc82fb5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58f29adc-4a13-4f12-9e45-b9fedc82fb5d
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-58f29adc-4a13-4f12-9e45-b9fedc82fb5d
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
correlation: qa-19e3fbdd-1726-427c-93bb-acc400100c26

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19e3fbdd-1726-427c-93bb-acc400100c26
Content-Type: application/json

--- request body ---
{"handle":"qa-17a59f284d24","password":"****"}

--- response: 401 in 6 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-19e3fbdd-1726-427c-93bb-acc400100c26
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 298
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-19e3fbdd-1726-427c-93bb-acc400100c26"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-08ac8c00-5fd8-42ac-99a1-751af6bd47c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08ac8c00-5fd8-42ac-99a1-751af6bd47c7
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-08ac8c00-5fd8-42ac-99a1-751af6bd47c7
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
correlation: qa-824b5638-1407-4c52-b0ad-338774178a82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-824b5638-1407-4c52-b0ad-338774178a82
Content-Type: application/json

--- request body ---
{"handle":"qa-9e6cdf22a900","password":"****"}

--- response: 401 in 10 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-824b5638-1407-4c52-b0ad-338774178a82
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 293
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-824b5638-1407-4c52-b0ad-338774178a82"}
```
