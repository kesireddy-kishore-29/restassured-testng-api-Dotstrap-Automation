# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/ledger]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[14]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 52 | `qa-df5e91cb-6dc7-45bc-b772-59774d71a036` |
| 2 | `POST /v1/accounts` | 201 | 37 | `qa-36e3a559-8f6f-4dcb-87e2-73ae564518aa` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-d372248d-50d9-4353-9f36-a697b154a5cf` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-37d77e1f-4d40-481d-920d-db73d34a8c85` |
| 5 | `GET /v1/credits/ledger` | 503 | 14 | `qa-60fd3328-6539-4b8b-9066-61ceadd9580a` |
| 6 | `POST /v1/auth/token` | 200 | 70 | `qa-309503b8-d51a-4f6e-8c1f-9c7d14481dfd` |
| 7 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-800094ff-5810-42f5-aa9c-7a2fa1d9be1f` |
| 8 | `POST /v1/auth/token` | 401 | 5 | `qa-4981f76a-2abd-41e1-bea2-722d31d649e5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-8520a229-fb21-442b-bdcb-f0f1b6b8df08` |
| 10 | `POST /v1/auth/token` | 401 | 31 | `qa-384a4bbc-7cec-4308-9ab3-34c999064f39` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-df5e91cb-6dc7-45bc-b772-59774d71a036

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df5e91cb-6dc7-45bc-b772-59774d71a036
Content-Type: application/json

--- request body ---
{"handle":"qa-78c3b540efcd","displayName":"QA 78c3b540efcd","password":"****","region":"eu"}

--- response: 201 in 52 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-df5e91cb-6dc7-45bc-b772-59774d71a036
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 366
RateLimit-Reset: 6
Location: /v1/accounts/qa-78c3b540efcd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e4727a5c-988a-4a32-834a-6da656a4dd96","handle":"qa-78c3b540efcd","displayName":"QA 78c3b540efcd","region":"eu","role":"user","createdAt":"2026-11-21T09:57:12.021322669Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-36e3a559-8f6f-4dcb-87e2-73ae564518aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36e3a559-8f6f-4dcb-87e2-73ae564518aa
Content-Type: application/json

--- request body ---
{"handle":"qa-ab4caf365cb5","displayName":"QA ab4caf365cb5","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-36e3a559-8f6f-4dcb-87e2-73ae564518aa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 361
RateLimit-Reset: 6
Location: /v1/accounts/qa-ab4caf365cb5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6511d94c-7300-42e3-b7e4-10d0fe2e33d6","handle":"qa-ab4caf365cb5","displayName":"QA ab4caf365cb5","region":"eu","role":"user","createdAt":"2026-11-21T09:57:12.099490982Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d372248d-50d9-4353-9f36-a697b154a5cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d372248d-50d9-4353-9f36-a697b154a5cf
Content-Type: application/json

--- request body ---
{"handle":"qa-78c3b540efcd","password":"****"}

--- response: 200 in 28 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-d372248d-50d9-4353-9f36-a697b154a5cf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 354
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e4727a5c-988a-4a32-834a-6da656a4dd96"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-37d77e1f-4d40-481d-920d-db73d34a8c85

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37d77e1f-4d40-481d-920d-db73d34a8c85
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ab4caf365cb5","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-37d77e1f-4d40-481d-920d-db73d34a8c85
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
Location: /v1/conversations/cnv_206f95b7-0061-49c5-a7b7-4a31cf69e1a6
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_206f95b7-0061-49c5-a7b7-4a31cf69e1a6","subject":"Error contract","status":"open","region":"eu","participants":["qa-78c3b540efcd","qa-ab4caf365cb5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:12.180825815Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-60fd3328-6539-4b8b-9066-61ceadd9580a

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: c906024b-4520-4e63-90e8-7a3c58c721a3
X-Correlation-Id: qa-60fd3328-6539-4b8b-9066-61ceadd9580a
Content-Type: application/json

--- response: 503 in 14 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-60fd3328-6539-4b8b-9066-61ceadd9580a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 262

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/ledger","correlationId":"qa-60fd3328-6539-4b8b-9066-61ceadd9580a"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-309503b8-d51a-4f6e-8c1f-9c7d14481dfd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-309503b8-d51a-4f6e-8c1f-9c7d14481dfd
Content-Type: application/json

--- request body ---
{"handle":"qa-ab4caf365cb5","password":"****"}

--- response: 200 in 70 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-309503b8-d51a-4f6e-8c1f-9c7d14481dfd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 337
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6511d94c-7300-42e3-b7e4-10d0fe2e33d6"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-800094ff-5810-42f5-aa9c-7a2fa1d9be1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-800094ff-5810-42f5-aa9c-7a2fa1d9be1f
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-800094ff-5810-42f5-aa9c-7a2fa1d9be1f
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
correlation: qa-4981f76a-2abd-41e1-bea2-722d31d649e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4981f76a-2abd-41e1-bea2-722d31d649e5
Content-Type: application/json

--- request body ---
{"handle":"qa-ab4caf365cb5","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4981f76a-2abd-41e1-bea2-722d31d649e5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 332
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4981f76a-2abd-41e1-bea2-722d31d649e5"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8520a229-fb21-442b-bdcb-f0f1b6b8df08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8520a229-fb21-442b-bdcb-f0f1b6b8df08
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8520a229-fb21-442b-bdcb-f0f1b6b8df08
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
correlation: qa-384a4bbc-7cec-4308-9ab3-34c999064f39

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-384a4bbc-7cec-4308-9ab3-34c999064f39
Content-Type: application/json

--- request body ---
{"handle":"qa-78c3b540efcd","password":"****"}

--- response: 401 in 31 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-384a4bbc-7cec-4308-9ab3-34c999064f39
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 327
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-384a4bbc-7cec-4308-9ab3-34c999064f39"}
```
