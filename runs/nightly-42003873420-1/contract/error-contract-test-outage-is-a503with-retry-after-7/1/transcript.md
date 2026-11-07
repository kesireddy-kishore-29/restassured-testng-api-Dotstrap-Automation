# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[7]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 62 | `qa-d456857e-379a-4e3d-99b3-7e32e9067a8d` |
| 2 | `POST /v1/accounts` | 201 | 47 | `qa-61817a82-a0e7-447b-855e-acafef25ee2e` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-a2610d36-0d26-454f-8fdc-621724bcdc2a` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-9823e25d-815f-4c7d-973e-9b878091033b` |
| 5 | `GET /v1/conversations` | 503 | 16 | `qa-af2a5590-55d6-43a8-8b40-7bbf19860280` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-8af10363-4744-4d3b-83ad-0d11bef8d077` |
| 7 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-1dd0feae-fceb-4722-b633-c959bf67e48d` |
| 8 | `POST /v1/auth/token` | 401 | 46 | `qa-71fa48b1-4264-47ec-85a6-dfc37c593393` |
| 9 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-a8a6e94c-d964-4d7a-bf61-351ed6a0d68e` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-27d30a11-c115-4462-9302-979a6e8951c1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d456857e-379a-4e3d-99b3-7e32e9067a8d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d456857e-379a-4e3d-99b3-7e32e9067a8d
Content-Type: application/json

--- request body ---
{"handle":"qa-e2e23f613681","displayName":"QA e2e23f613681","password":"****","region":"eu"}

--- response: 201 in 62 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-d456857e-379a-4e3d-99b3-7e32e9067a8d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 465
RateLimit-Reset: 7
Location: /v1/accounts/qa-e2e23f613681
X-Served-Region: eu
Content-Length: 181

{"id":"acc_defde3c8-be86-4a90-9fa0-648326e5c984","handle":"qa-e2e23f613681","displayName":"QA e2e23f613681","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.577119480Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-61817a82-a0e7-447b-855e-acafef25ee2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61817a82-a0e7-447b-855e-acafef25ee2e
Content-Type: application/json

--- request body ---
{"handle":"qa-fe5d22b7dfd3","displayName":"QA fe5d22b7dfd3","password":"****","region":"eu"}

--- response: 201 in 47 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-61817a82-a0e7-447b-855e-acafef25ee2e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 455
RateLimit-Reset: 7
Location: /v1/accounts/qa-fe5d22b7dfd3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7d11faa8-7236-42e1-b5f2-66f2d1f1ce89","handle":"qa-fe5d22b7dfd3","displayName":"QA fe5d22b7dfd3","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.628373950Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a2610d36-0d26-454f-8fdc-621724bcdc2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2610d36-0d26-454f-8fdc-621724bcdc2a
Content-Type: application/json

--- request body ---
{"handle":"qa-e2e23f613681","password":"****"}

--- response: 200 in 31 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-a2610d36-0d26-454f-8fdc-621724bcdc2a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 450
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_defde3c8-be86-4a90-9fa0-648326e5c984"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9823e25d-815f-4c7d-973e-9b878091033b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9823e25d-815f-4c7d-973e-9b878091033b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-fe5d22b7dfd3","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-9823e25d-815f-4c7d-973e-9b878091033b
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
Location: /v1/conversations/cnv_f17e6a86-4b9f-4ec7-9a3a-2bb67b60c616
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f17e6a86-4b9f-4ec7-9a3a-2bb67b60c616","subject":"Error contract","status":"open","region":"eu","participants":["qa-e2e23f613681","qa-fe5d22b7dfd3"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:55.699063396Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-af2a5590-55d6-43a8-8b40-7bbf19860280

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 0b535c78-fe61-4909-a20c-73a2f5c3cd5d
X-Correlation-Id: qa-af2a5590-55d6-43a8-8b40-7bbf19860280
Content-Type: application/json

--- response: 503 in 16 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-af2a5590-55d6-43a8-8b40-7bbf19860280
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-af2a5590-55d6-43a8-8b40-7bbf19860280"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8af10363-4744-4d3b-83ad-0d11bef8d077

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8af10363-4744-4d3b-83ad-0d11bef8d077
Content-Type: application/json

--- request body ---
{"handle":"qa-fe5d22b7dfd3","password":"****"}

--- response: 200 in 22 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-8af10363-4744-4d3b-83ad-0d11bef8d077
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 435
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7d11faa8-7236-42e1-b5f2-66f2d1f1ce89"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1dd0feae-fceb-4722-b633-c959bf67e48d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1dd0feae-fceb-4722-b633-c959bf67e48d
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1dd0feae-fceb-4722-b633-c959bf67e48d
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
correlation: qa-71fa48b1-4264-47ec-85a6-dfc37c593393

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71fa48b1-4264-47ec-85a6-dfc37c593393
Content-Type: application/json

--- request body ---
{"handle":"qa-fe5d22b7dfd3","password":"****"}

--- response: 401 in 46 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-71fa48b1-4264-47ec-85a6-dfc37c593393
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 426
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-71fa48b1-4264-47ec-85a6-dfc37c593393"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a8a6e94c-d964-4d7a-bf61-351ed6a0d68e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8a6e94c-d964-4d7a-bf61-351ed6a0d68e
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a8a6e94c-d964-4d7a-bf61-351ed6a0d68e
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
correlation: qa-27d30a11-c115-4462-9302-979a6e8951c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27d30a11-c115-4462-9302-979a6e8951c1
Content-Type: application/json

--- request body ---
{"handle":"qa-e2e23f613681","password":"****"}

--- response: 401 in 16 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-27d30a11-c115-4462-9302-979a6e8951c1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 418
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-27d30a11-c115-4462-9302-979a6e8951c1"}
```
