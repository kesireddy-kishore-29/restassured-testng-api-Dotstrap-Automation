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
| 1 | `POST /v1/accounts` | 201 | 52 | `qa-4271d41d-948c-4f46-b096-f93665ee27c6` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-2b009ea7-6a77-482e-b54f-6d8f9d17b772` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-e2d452d9-781b-477a-ad01-6777eaac712d` |
| 4 | `POST /v1/conversations` | 201 | 41 | `qa-c0007769-a437-4c29-b51e-99eae0621572` |
| 5 | `POST /v1/conversations` | 503 | 14 | `qa-c1b153c7-2bc9-4bcf-bb6d-d7f81d15e013` |
| 6 | `POST /v1/auth/token` | 200 | 44 | `qa-0ed9a3fe-8da7-4625-8c06-27e4279969f1` |
| 7 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-32d981e7-3d9f-48b5-8b40-017fe04caad5` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-a40c2229-ca33-4314-9ecc-986967f2198e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-04685535-e5c3-415a-af27-057efb95bacf` |
| 10 | `POST /v1/auth/token` | 401 | 20 | `qa-275b84fc-755b-40ee-a9d9-6c68a6334b12` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4271d41d-948c-4f46-b096-f93665ee27c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4271d41d-948c-4f46-b096-f93665ee27c6
Content-Type: application/json

--- request body ---
{"handle":"qa-3a43aea51432","displayName":"QA 3a43aea51432","password":"****","region":"eu"}

--- response: 201 in 52 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-4271d41d-948c-4f46-b096-f93665ee27c6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 499
RateLimit-Reset: 8
Location: /v1/accounts/qa-3a43aea51432
X-Served-Region: eu
Content-Length: 181

{"id":"acc_454e49ce-dd3c-4e31-afd5-445fb3762a8e","handle":"qa-3a43aea51432","displayName":"QA 3a43aea51432","region":"eu","role":"user","createdAt":"2026-10-30T08:46:03.828809917Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2b009ea7-6a77-482e-b54f-6d8f9d17b772

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b009ea7-6a77-482e-b54f-6d8f9d17b772
Content-Type: application/json

--- request body ---
{"handle":"qa-cc4c1ad7ee9b","displayName":"QA cc4c1ad7ee9b","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b009ea7-6a77-482e-b54f-6d8f9d17b772
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 490
RateLimit-Reset: 8
Location: /v1/accounts/qa-cc4c1ad7ee9b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_de025d2a-3e31-46f8-ba04-bf9338e0a65a","handle":"qa-cc4c1ad7ee9b","displayName":"QA cc4c1ad7ee9b","region":"eu","role":"user","createdAt":"2026-10-30T08:46:03.897361841Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e2d452d9-781b-477a-ad01-6777eaac712d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2d452d9-781b-477a-ad01-6777eaac712d
Content-Type: application/json

--- request body ---
{"handle":"qa-3a43aea51432","password":"****"}

--- response: 200 in 29 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2d452d9-781b-477a-ad01-6777eaac712d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 484
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_454e49ce-dd3c-4e31-afd5-445fb3762a8e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c0007769-a437-4c29-b51e-99eae0621572

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0007769-a437-4c29-b51e-99eae0621572
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-cc4c1ad7ee9b","subject":"Error contract","message":"Hi"}

--- response: 201 in 41 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-c0007769-a437-4c29-b51e-99eae0621572
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
Location: /v1/conversations/cnv_e0ee48d1-1693-464a-941b-7a2ddbe2046d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e0ee48d1-1693-464a-941b-7a2ddbe2046d","subject":"Error contract","status":"open","region":"eu","participants":["qa-3a43aea51432","qa-cc4c1ad7ee9b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:03.999842601Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-c1b153c7-2bc9-4bcf-bb6d-d7f81d15e013

--- request headers ---
Accept: application/json
X-Fault-Key: 47feba18-b327-4060-84d2-b4be34766948
X-Fault: unavailable-once
X-Correlation-Id: qa-c1b153c7-2bc9-4bcf-bb6d-d7f81d15e013
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3a43aea51432","subject":"Probe","message":"Hi"}

--- response: 503 in 14 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c1b153c7-2bc9-4bcf-bb6d-d7f81d15e013
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-c1b153c7-2bc9-4bcf-bb6d-d7f81d15e013"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0ed9a3fe-8da7-4625-8c06-27e4279969f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ed9a3fe-8da7-4625-8c06-27e4279969f1
Content-Type: application/json

--- request body ---
{"handle":"qa-cc4c1ad7ee9b","password":"****"}

--- response: 200 in 44 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ed9a3fe-8da7-4625-8c06-27e4279969f1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 462
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_de025d2a-3e31-46f8-ba04-bf9338e0a65a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-32d981e7-3d9f-48b5-8b40-017fe04caad5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32d981e7-3d9f-48b5-8b40-017fe04caad5
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-32d981e7-3d9f-48b5-8b40-017fe04caad5
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
correlation: qa-a40c2229-ca33-4314-9ecc-986967f2198e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a40c2229-ca33-4314-9ecc-986967f2198e
Content-Type: application/json

--- request body ---
{"handle":"qa-cc4c1ad7ee9b","password":"****"}

--- response: 401 in 19 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a40c2229-ca33-4314-9ecc-986967f2198e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 451
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a40c2229-ca33-4314-9ecc-986967f2198e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-04685535-e5c3-415a-af27-057efb95bacf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04685535-e5c3-415a-af27-057efb95bacf
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-04685535-e5c3-415a-af27-057efb95bacf
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
correlation: qa-275b84fc-755b-40ee-a9d9-6c68a6334b12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-275b84fc-755b-40ee-a9d9-6c68a6334b12
Content-Type: application/json

--- request body ---
{"handle":"qa-3a43aea51432","password":"****"}

--- response: 401 in 20 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-275b84fc-755b-40ee-a9d9-6c68a6334b12
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 444
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-275b84fc-755b-40ee-a9d9-6c68a6334b12"}
```
