# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[14]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-573181f2-f69a-45fa-9e00-f0ddbff08aa5` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-a967cedd-1117-4a48-bee7-0d3a6aadf63f` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-76178066-8961-4471-9350-173518b9dd13` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-0b2c09b9-0e2c-4f53-aa19-e2157d6e071b` |
| 5 | `POST /v1/conversations/{id}/messages` | 422 | 53 | `qa-9dc2992f-978b-4e57-b3ed-82692fdc0374` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-9257603f-83ea-4f57-9869-b730f1d0a5c2` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-8045dd20-16cb-416a-a9f8-1cfb2fd4a7df` |
| 8 | `POST /v1/auth/token` | 401 | 6 | `qa-208ef980-daa0-4075-a319-c75636ac8b88` |
| 9 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-d851a00a-9718-44d5-b273-0d547356ad37` |
| 10 | `POST /v1/auth/token` | 401 | 7 | `qa-71ecd017-ac76-4dc1-ad81-f5eff62ce0d8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-573181f2-f69a-45fa-9e00-f0ddbff08aa5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-573181f2-f69a-45fa-9e00-f0ddbff08aa5
Content-Type: application/json

--- request body ---
{"handle":"qa-8df3b99332e1","displayName":"QA 8df3b99332e1","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-573181f2-f69a-45fa-9e00-f0ddbff08aa5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 357
RateLimit-Reset: 8
Location: /v1/accounts/qa-8df3b99332e1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5744fecb-72d7-43e8-92cd-784b91083877","handle":"qa-8df3b99332e1","displayName":"QA 8df3b99332e1","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.877455525Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a967cedd-1117-4a48-bee7-0d3a6aadf63f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a967cedd-1117-4a48-bee7-0d3a6aadf63f
Content-Type: application/json

--- request body ---
{"handle":"qa-db88b8fb1670","displayName":"QA db88b8fb1670","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-a967cedd-1117-4a48-bee7-0d3a6aadf63f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 349
RateLimit-Reset: 8
Location: /v1/accounts/qa-db88b8fb1670
X-Served-Region: eu
Content-Length: 181

{"id":"acc_16d189ba-3657-43f1-a2d8-1d5d563a9e8e","handle":"qa-db88b8fb1670","displayName":"QA db88b8fb1670","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.898927807Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-76178066-8961-4471-9350-173518b9dd13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76178066-8961-4471-9350-173518b9dd13
Content-Type: application/json

--- request body ---
{"handle":"qa-8df3b99332e1","password":"****"}

--- response: 200 in 27 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-76178066-8961-4471-9350-173518b9dd13
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 343
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5744fecb-72d7-43e8-92cd-784b91083877"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0b2c09b9-0e2c-4f53-aa19-e2157d6e071b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b2c09b9-0e2c-4f53-aa19-e2157d6e071b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-db88b8fb1670","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b2c09b9-0e2c-4f53-aa19-e2157d6e071b
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
Location: /v1/conversations/cnv_2a7a5602-37d7-4cc7-acc6-4b83ed9f5b7e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2a7a5602-37d7-4cc7-acc6-4b83ed9f5b7e","subject":"Error contract","status":"open","region":"eu","participants":["qa-8df3b99332e1","qa-db88b8fb1670"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:31.981450738Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_2a7a5602-37d7-4cc7-acc6-4b83ed9f5b7e/messages
correlation: qa-9dc2992f-978b-4e57-b3ed-82692fdc0374

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9dc2992f-978b-4e57-b3ed-82692fdc0374
Content-Type: application/json

--- request body ---
{"body":" "}

--- response: 422 in 53 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9dc2992f-978b-4e57-b3ed-82692fdc0374
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
Content-Length: 363

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations/cnv_2a7a5602-37d7-4cc7-acc6-4b83ed9f5b7e/messages","correlationId":"qa-9dc2992f-978b-4e57-b3ed-82692fdc0374","errors":[{"field":"body","message":"1-2000 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9257603f-83ea-4f57-9869-b730f1d0a5c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9257603f-83ea-4f57-9869-b730f1d0a5c2
Content-Type: application/json

--- request body ---
{"handle":"qa-db88b8fb1670","password":"****"}

--- response: 200 in 16 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-9257603f-83ea-4f57-9869-b730f1d0a5c2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 313
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_16d189ba-3657-43f1-a2d8-1d5d563a9e8e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8045dd20-16cb-416a-a9f8-1cfb2fd4a7df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8045dd20-16cb-416a-a9f8-1cfb2fd4a7df
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8045dd20-16cb-416a-a9f8-1cfb2fd4a7df
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
correlation: qa-208ef980-daa0-4075-a319-c75636ac8b88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-208ef980-daa0-4075-a319-c75636ac8b88
Content-Type: application/json

--- request body ---
{"handle":"qa-db88b8fb1670","password":"****"}

--- response: 401 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-208ef980-daa0-4075-a319-c75636ac8b88
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 308
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-208ef980-daa0-4075-a319-c75636ac8b88"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d851a00a-9718-44d5-b273-0d547356ad37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d851a00a-9718-44d5-b273-0d547356ad37
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d851a00a-9718-44d5-b273-0d547356ad37
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
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-71ecd017-ac76-4dc1-ad81-f5eff62ce0d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71ecd017-ac76-4dc1-ad81-f5eff62ce0d8
Content-Type: application/json

--- request body ---
{"handle":"qa-8df3b99332e1","password":"****"}

--- response: 401 in 7 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-71ecd017-ac76-4dc1-ad81-f5eff62ce0d8
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-71ecd017-ac76-4dc1-ad81-f5eff62ce0d8"}
```
