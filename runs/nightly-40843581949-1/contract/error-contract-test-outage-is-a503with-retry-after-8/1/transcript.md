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
| 1 | `POST /v1/accounts` | 201 | 43 | `qa-7137db51-2793-4b1f-aa14-d4f37db80a0d` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-1b93d3dd-ee12-4a52-b952-2b77f2cd6e46` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-d3781ac8-e9a9-42f4-94c0-757ce1a7b954` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-c89f8396-87bd-4f6d-8170-17f1f0d33c55` |
| 5 | `GET /v1/conversations/{id}` | 503 | 19 | `qa-a8517e47-78f2-4e2d-bd9c-0f0f7316dd4d` |
| 6 | `POST /v1/auth/token` | 200 | 34 | `qa-2f7fb837-535d-4f99-ade2-9431c61ac2df` |
| 7 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-a70a0b48-3b72-4a43-8790-a917f06e8c67` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-2264e479-0b80-49ab-8672-8a0eef0a815a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-4de79caa-c499-43ae-9810-4b49b8dc9ac0` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-5b6fca54-bc4c-42db-823e-6552ff5fd584` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7137db51-2793-4b1f-aa14-d4f37db80a0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7137db51-2793-4b1f-aa14-d4f37db80a0d
Content-Type: application/json

--- request body ---
{"handle":"qa-bed352542611","displayName":"QA bed352542611","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-7137db51-2793-4b1f-aa14-d4f37db80a0d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 445
RateLimit-Reset: 8
Location: /v1/accounts/qa-bed352542611
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1955067a-8120-45fd-b66b-d4293c38f44d","handle":"qa-bed352542611","displayName":"QA bed352542611","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.372557318Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1b93d3dd-ee12-4a52-b952-2b77f2cd6e46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b93d3dd-ee12-4a52-b952-2b77f2cd6e46
Content-Type: application/json

--- request body ---
{"handle":"qa-ddc4d7ad020c","displayName":"QA ddc4d7ad020c","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b93d3dd-ee12-4a52-b952-2b77f2cd6e46
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 440
RateLimit-Reset: 8
Location: /v1/accounts/qa-ddc4d7ad020c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_94258d8d-609d-4e2c-a791-7ac41b214d6a","handle":"qa-ddc4d7ad020c","displayName":"QA ddc4d7ad020c","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.419960229Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d3781ac8-e9a9-42f4-94c0-757ce1a7b954

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3781ac8-e9a9-42f4-94c0-757ce1a7b954
Content-Type: application/json

--- request body ---
{"handle":"qa-bed352542611","password":"****"}

--- response: 200 in 21 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3781ac8-e9a9-42f4-94c0-757ce1a7b954
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 430
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1955067a-8120-45fd-b66b-d4293c38f44d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c89f8396-87bd-4f6d-8170-17f1f0d33c55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c89f8396-87bd-4f6d-8170-17f1f0d33c55
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ddc4d7ad020c","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-c89f8396-87bd-4f6d-8170-17f1f0d33c55
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
Location: /v1/conversations/cnv_bd0e5d87-a8ae-4611-8b8e-90db29abdffe
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_bd0e5d87-a8ae-4611-8b8e-90db29abdffe","subject":"Error contract","status":"open","region":"eu","participants":["qa-bed352542611","qa-ddc4d7ad020c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:39:00.498950203Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_bd0e5d87-a8ae-4611-8b8e-90db29abdffe
correlation: qa-a8517e47-78f2-4e2d-bd9c-0f0f7316dd4d

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: ccfcb118-5939-4c13-b105-1a04ffd40910
X-Correlation-Id: qa-a8517e47-78f2-4e2d-bd9c-0f0f7316dd4d
Content-Type: application/json

--- response: 503 in 19 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a8517e47-78f2-4e2d-bd9c-0f0f7316dd4d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 302

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_bd0e5d87-a8ae-4611-8b8e-90db29abdffe","correlationId":"qa-a8517e47-78f2-4e2d-bd9c-0f0f7316dd4d"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2f7fb837-535d-4f99-ade2-9431c61ac2df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f7fb837-535d-4f99-ade2-9431c61ac2df
Content-Type: application/json

--- request body ---
{"handle":"qa-ddc4d7ad020c","password":"****"}

--- response: 200 in 34 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f7fb837-535d-4f99-ade2-9431c61ac2df
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 409
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_94258d8d-609d-4e2c-a791-7ac41b214d6a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a70a0b48-3b72-4a43-8790-a917f06e8c67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a70a0b48-3b72-4a43-8790-a917f06e8c67
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a70a0b48-3b72-4a43-8790-a917f06e8c67
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
correlation: qa-2264e479-0b80-49ab-8672-8a0eef0a815a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2264e479-0b80-49ab-8672-8a0eef0a815a
Content-Type: application/json

--- request body ---
{"handle":"qa-ddc4d7ad020c","password":"****"}

--- response: 401 in 14 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2264e479-0b80-49ab-8672-8a0eef0a815a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 404
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2264e479-0b80-49ab-8672-8a0eef0a815a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4de79caa-c499-43ae-9810-4b49b8dc9ac0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4de79caa-c499-43ae-9810-4b49b8dc9ac0
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4de79caa-c499-43ae-9810-4b49b8dc9ac0
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
correlation: qa-5b6fca54-bc4c-42db-823e-6552ff5fd584

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b6fca54-bc4c-42db-823e-6552ff5fd584
Content-Type: application/json

--- request body ---
{"handle":"qa-bed352542611","password":"****"}

--- response: 401 in 16 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5b6fca54-bc4c-42db-823e-6552ff5fd584
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 399
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5b6fca54-bc4c-42db-823e-6552ff5fd584"}
```
