# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[11]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-df003a86-6dbb-4cf6-8c7d-8411a54970ac` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-997f106e-37c7-4389-aca2-513c45cc0804` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-e17766a2-a621-4423-93fc-6140c6076087` |
| 4 | `POST /v1/conversations` | 201 | 22 | `qa-12e84baf-2870-485a-9967-ab27509d62a6` |
| 5 | `POST /v1/conversations/{id}/read` | 503 | 13 | `qa-a407ad6f-2db2-444d-8f6a-490837709a02` |
| 6 | `POST /v1/auth/token` | 200 | 33 | `qa-14b8096b-8ff3-4750-89ae-bd13991366a1` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-8c4de128-eb81-4bd3-83cf-55ea5539a0ee` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-1125056d-ccc8-4bfe-9c70-2cf3fe9da8e5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-1d67f0a9-5915-4a08-af6f-d8f66aa28a32` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-554d43bb-95e6-4116-a19e-8f5902124e14` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-df003a86-6dbb-4cf6-8c7d-8411a54970ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df003a86-6dbb-4cf6-8c7d-8411a54970ac
Content-Type: application/json

--- request body ---
{"handle":"qa-cdeececfec49","displayName":"QA cdeececfec49","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-df003a86-6dbb-4cf6-8c7d-8411a54970ac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 404
RateLimit-Reset: 8
Location: /v1/accounts/qa-cdeececfec49
X-Served-Region: eu
Content-Length: 181

{"id":"acc_191abfe7-4d90-4e25-906e-c271e32ef2bb","handle":"qa-cdeececfec49","displayName":"QA cdeececfec49","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.393675872Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-997f106e-37c7-4389-aca2-513c45cc0804

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-997f106e-37c7-4389-aca2-513c45cc0804
Content-Type: application/json

--- request body ---
{"handle":"qa-5e129287b63e","displayName":"QA 5e129287b63e","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-997f106e-37c7-4389-aca2-513c45cc0804
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 394
RateLimit-Reset: 8
Location: /v1/accounts/qa-5e129287b63e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8dce6b23-a3e4-462e-a0d8-ecef8486dcff","handle":"qa-5e129287b63e","displayName":"QA 5e129287b63e","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.433683792Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e17766a2-a621-4423-93fc-6140c6076087

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e17766a2-a621-4423-93fc-6140c6076087
Content-Type: application/json

--- request body ---
{"handle":"qa-cdeececfec49","password":"****"}

--- response: 200 in 32 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-e17766a2-a621-4423-93fc-6140c6076087
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 387
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_191abfe7-4d90-4e25-906e-c271e32ef2bb"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-12e84baf-2870-485a-9967-ab27509d62a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12e84baf-2870-485a-9967-ab27509d62a6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5e129287b63e","subject":"Error contract","message":"Hi"}

--- response: 201 in 22 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-12e84baf-2870-485a-9967-ab27509d62a6
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
Location: /v1/conversations/cnv_89d8ac38-8475-449b-995f-a3718d2f5711
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_89d8ac38-8475-449b-995f-a3718d2f5711","subject":"Error contract","status":"open","region":"eu","participants":["qa-cdeececfec49","qa-5e129287b63e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:54:59.535321140Z"}
```

## 5. POST /v1/conversations/{id}/read

```text
#5 POST http://localhost:7070/v1/conversations/cnv_89d8ac38-8475-449b-995f-a3718d2f5711/read
correlation: qa-a407ad6f-2db2-444d-8f6a-490837709a02

--- request headers ---
Accept: application/json
X-Fault-Key: 30a13927-137a-48ab-aac4-2fcc5adc7b07
X-Fault: unavailable-once
X-Correlation-Id: qa-a407ad6f-2db2-444d-8f6a-490837709a02
Content-Type: application/json

--- response: 503 in 13 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a407ad6f-2db2-444d-8f6a-490837709a02
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 307

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_89d8ac38-8475-449b-995f-a3718d2f5711/read","correlationId":"qa-a407ad6f-2db2-444d-8f6a-490837709a02"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-14b8096b-8ff3-4750-89ae-bd13991366a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14b8096b-8ff3-4750-89ae-bd13991366a1
Content-Type: application/json

--- request body ---
{"handle":"qa-5e129287b63e","password":"****"}

--- response: 200 in 33 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-14b8096b-8ff3-4750-89ae-bd13991366a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 380
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8dce6b23-a3e4-462e-a0d8-ecef8486dcff"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8c4de128-eb81-4bd3-83cf-55ea5539a0ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c4de128-eb81-4bd3-83cf-55ea5539a0ee
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8c4de128-eb81-4bd3-83cf-55ea5539a0ee
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
correlation: qa-1125056d-ccc8-4bfe-9c70-2cf3fe9da8e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1125056d-ccc8-4bfe-9c70-2cf3fe9da8e5
Content-Type: application/json

--- request body ---
{"handle":"qa-5e129287b63e","password":"****"}

--- response: 401 in 12 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1125056d-ccc8-4bfe-9c70-2cf3fe9da8e5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 372
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1125056d-ccc8-4bfe-9c70-2cf3fe9da8e5"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1d67f0a9-5915-4a08-af6f-d8f66aa28a32

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d67f0a9-5915-4a08-af6f-d8f66aa28a32
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1d67f0a9-5915-4a08-af6f-d8f66aa28a32
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
correlation: qa-554d43bb-95e6-4116-a19e-8f5902124e14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-554d43bb-95e6-4116-a19e-8f5902124e14
Content-Type: application/json

--- request body ---
{"handle":"qa-cdeececfec49","password":"****"}

--- response: 401 in 12 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-554d43bb-95e6-4116-a19e-8f5902124e14
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 366
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-554d43bb-95e6-4116-a19e-8f5902124e14"}
```
