# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[9]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-17458cec-4347-427b-bd8b-c7cbf93060ba` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-3e85db72-9cd3-4a1f-9b1d-8d43eb98fa44` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-513617f1-b9f3-46f1-9581-75345d77d098` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-792f0694-ae31-4bb8-a85d-71133e6c7137` |
| 5 | `GET /v1/conversations/{id}/messages` | 503 | 9 | `qa-9f3e243e-3b48-43ee-9515-769e28a29bc5` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-475d0805-56a7-4624-b358-ae5dcd5279c5` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-c917630c-4d3e-4a25-a2ed-6bf2c57292ef` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-82b5d379-0e99-4d19-aeb2-e68dd7df523a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-0cf5a092-75dd-42ba-b9b9-a623a250313b` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-aaf0e502-a013-45ce-93fe-de5e1b5aa11d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-17458cec-4347-427b-bd8b-c7cbf93060ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17458cec-4347-427b-bd8b-c7cbf93060ba
Content-Type: application/json

--- request body ---
{"handle":"qa-aa7936601007","displayName":"QA aa7936601007","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-17458cec-4347-427b-bd8b-c7cbf93060ba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 412
RateLimit-Reset: 8
Location: /v1/accounts/qa-aa7936601007
X-Served-Region: eu
Content-Length: 181

{"id":"acc_85e21f6a-10b3-4513-a1b5-433fef46ee50","handle":"qa-aa7936601007","displayName":"QA aa7936601007","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.298695308Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3e85db72-9cd3-4a1f-9b1d-8d43eb98fa44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e85db72-9cd3-4a1f-9b1d-8d43eb98fa44
Content-Type: application/json

--- request body ---
{"handle":"qa-1e80c6c47dfc","displayName":"QA 1e80c6c47dfc","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e85db72-9cd3-4a1f-9b1d-8d43eb98fa44
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 401
RateLimit-Reset: 8
Location: /v1/accounts/qa-1e80c6c47dfc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9529f84-3703-4506-bf91-faffefe1b025","handle":"qa-1e80c6c47dfc","displayName":"QA 1e80c6c47dfc","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.344083782Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-513617f1-b9f3-46f1-9581-75345d77d098

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-513617f1-b9f3-46f1-9581-75345d77d098
Content-Type: application/json

--- request body ---
{"handle":"qa-aa7936601007","password":"****"}

--- response: 200 in 31 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-513617f1-b9f3-46f1-9581-75345d77d098
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 395
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_85e21f6a-10b3-4513-a1b5-433fef46ee50"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-792f0694-ae31-4bb8-a85d-71133e6c7137

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-792f0694-ae31-4bb8-a85d-71133e6c7137
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1e80c6c47dfc","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-792f0694-ae31-4bb8-a85d-71133e6c7137
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
Location: /v1/conversations/cnv_87f7db57-dbd7-4815-a5cb-dda4a3ebb67a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_87f7db57-dbd7-4815-a5cb-dda4a3ebb67a","subject":"Error contract","status":"open","region":"eu","participants":["qa-aa7936601007","qa-1e80c6c47dfc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:03.405508417Z"}
```

## 5. GET /v1/conversations/{id}/messages

```text
#5 GET http://localhost:7070/v1/conversations/cnv_87f7db57-dbd7-4815-a5cb-dda4a3ebb67a/messages
correlation: qa-9f3e243e-3b48-43ee-9515-769e28a29bc5

--- request headers ---
Accept: application/json
X-Fault-Key: b391348e-7e15-4ab6-af46-59608bce71c8
X-Fault: unavailable-once
X-Correlation-Id: qa-9f3e243e-3b48-43ee-9515-769e28a29bc5
Content-Type: application/json

--- response: 503 in 9 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9f3e243e-3b48-43ee-9515-769e28a29bc5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_87f7db57-dbd7-4815-a5cb-dda4a3ebb67a/messages","correlationId":"qa-9f3e243e-3b48-43ee-9515-769e28a29bc5"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-475d0805-56a7-4624-b358-ae5dcd5279c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-475d0805-56a7-4624-b358-ae5dcd5279c5
Content-Type: application/json

--- request body ---
{"handle":"qa-1e80c6c47dfc","password":"****"}

--- response: 200 in 26 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-475d0805-56a7-4624-b358-ae5dcd5279c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 373
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a9529f84-3703-4506-bf91-faffefe1b025"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c917630c-4d3e-4a25-a2ed-6bf2c57292ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c917630c-4d3e-4a25-a2ed-6bf2c57292ef
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c917630c-4d3e-4a25-a2ed-6bf2c57292ef
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
correlation: qa-82b5d379-0e99-4d19-aeb2-e68dd7df523a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82b5d379-0e99-4d19-aeb2-e68dd7df523a
Content-Type: application/json

--- request body ---
{"handle":"qa-1e80c6c47dfc","password":"****"}

--- response: 401 in 14 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-82b5d379-0e99-4d19-aeb2-e68dd7df523a
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-82b5d379-0e99-4d19-aeb2-e68dd7df523a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0cf5a092-75dd-42ba-b9b9-a623a250313b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0cf5a092-75dd-42ba-b9b9-a623a250313b
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0cf5a092-75dd-42ba-b9b9-a623a250313b
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
correlation: qa-aaf0e502-a013-45ce-93fe-de5e1b5aa11d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aaf0e502-a013-45ce-93fe-de5e1b5aa11d
Content-Type: application/json

--- request body ---
{"handle":"qa-aa7936601007","password":"****"}

--- response: 401 in 12 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aaf0e502-a013-45ce-93fe-de5e1b5aa11d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 355
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-aaf0e502-a013-45ce-93fe-de5e1b5aa11d"}
```
