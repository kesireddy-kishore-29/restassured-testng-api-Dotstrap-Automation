# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[4]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 42 | `qa-92f4af2e-023f-44ee-bceb-cd5cf480a5b8` |
| 2 | `POST /v1/accounts` | 201 | 47 | `qa-7d61c2c4-0ecd-4ac0-9b09-e3aca83688b4` |
| 3 | `POST /v1/accounts` | 201 | 42 | `qa-e1633746-dc15-4fb5-b215-fec1e7d084a7` |
| 4 | `POST /v1/auth/token` | 200 | 35 | `qa-b01677cb-3202-430b-824d-d5a724b478a2` |
| 5 | `POST /v1/conversations` | 201 | 12 | `qa-7feacec1-af68-4ac7-a13d-b5bf8780e2dd` |
| 6 | `POST /v1/auth/token` | 200 | 58 | `qa-e63fdc58-3710-4a6f-a8d2-0715fdbcd726` |
| 7 | `POST /v1/conversations/{id}/close` | 403 | 20 | `qa-e2a8878b-fa61-43cc-b835-09ea97348e8d` |
| 8 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-da23253f-1794-488e-b6b6-96a077e93883` |
| 9 | `POST /v1/auth/token` | 401 | 12 | `qa-51a66aba-56db-4001-b122-99f15db0c977` |
| 10 | `POST /v1/auth/token` | 200 | 35 | `qa-591855b0-c0b3-4b4b-9d6f-11fe3d3e697a` |
| 11 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-decb5783-dd26-49ed-8982-1f9098920b80` |
| 12 | `POST /v1/auth/token` | 401 | 17 | `qa-455a6199-d92f-4dad-b745-125e2b01512d` |
| 13 | `DELETE /v1/accounts/me` | 204 | 35 | `qa-b4539100-d256-4c41-a637-f39a49762fbf` |
| 14 | `POST /v1/auth/token` | 401 | 35 | `qa-ed42f542-4939-4b53-a907-2d0663bd026d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-92f4af2e-023f-44ee-bceb-cd5cf480a5b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92f4af2e-023f-44ee-bceb-cd5cf480a5b8
Content-Type: application/json

--- request body ---
{"handle":"qa-2171209d29b2","displayName":"QA 2171209d29b2","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-92f4af2e-023f-44ee-bceb-cd5cf480a5b8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 467
RateLimit-Reset: 7
Location: /v1/accounts/qa-2171209d29b2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_765271df-880e-422a-8429-06ae1d6518db","handle":"qa-2171209d29b2","displayName":"QA 2171209d29b2","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.508402287Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7d61c2c4-0ecd-4ac0-9b09-e3aca83688b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d61c2c4-0ecd-4ac0-9b09-e3aca83688b4
Content-Type: application/json

--- request body ---
{"handle":"qa-9397dfb4f216","displayName":"QA 9397dfb4f216","password":"****","region":"eu"}

--- response: 201 in 47 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d61c2c4-0ecd-4ac0-9b09-e3aca83688b4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 464
RateLimit-Reset: 7
Location: /v1/accounts/qa-9397dfb4f216
X-Served-Region: eu
Content-Length: 181

{"id":"acc_62f27314-28f3-42d6-93b8-667c7baff931","handle":"qa-9397dfb4f216","displayName":"QA 9397dfb4f216","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.535090111Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-e1633746-dc15-4fb5-b215-fec1e7d084a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1633746-dc15-4fb5-b215-fec1e7d084a7
Content-Type: application/json

--- request body ---
{"handle":"qa-4e235fa057bf","displayName":"QA 4e235fa057bf","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1633746-dc15-4fb5-b215-fec1e7d084a7
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
Location: /v1/accounts/qa-4e235fa057bf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a0d220f6-ef0d-4d60-9f93-e502a06b48d4","handle":"qa-4e235fa057bf","displayName":"QA 4e235fa057bf","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.623069207Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-b01677cb-3202-430b-824d-d5a724b478a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b01677cb-3202-430b-824d-d5a724b478a2
Content-Type: application/json

--- request body ---
{"handle":"qa-2171209d29b2","password":"****"}

--- response: 200 in 35 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-b01677cb-3202-430b-824d-d5a724b478a2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 445
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_765271df-880e-422a-8429-06ae1d6518db"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-7feacec1-af68-4ac7-a13d-b5bf8780e2dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7feacec1-af68-4ac7-a13d-b5bf8780e2dd
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9397dfb4f216","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-7feacec1-af68-4ac7-a13d-b5bf8780e2dd
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
Location: /v1/conversations/cnv_e1b0639b-125e-47cb-96ee-a586bfdce693
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e1b0639b-125e-47cb-96ee-a586bfdce693","subject":"Error contract","status":"open","region":"eu","participants":["qa-2171209d29b2","qa-9397dfb4f216"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:45.727099382Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e63fdc58-3710-4a6f-a8d2-0715fdbcd726

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e63fdc58-3710-4a6f-a8d2-0715fdbcd726
Content-Type: application/json

--- request body ---
{"handle":"qa-4e235fa057bf","password":"****"}

--- response: 200 in 58 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-e63fdc58-3710-4a6f-a8d2-0715fdbcd726
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 442
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a0d220f6-ef0d-4d60-9f93-e502a06b48d4"}
```

## 7. POST /v1/conversations/{id}/close

```text
#7 POST http://localhost:7070/v1/conversations/cnv_e1b0639b-125e-47cb-96ee-a586bfdce693/close
correlation: qa-e2a8878b-fa61-43cc-b835-09ea97348e8d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2a8878b-fa61-43cc-b835-09ea97348e8d
Content-Type: application/json

--- response: 403 in 20 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e2a8878b-fa61-43cc-b835-09ea97348e8d
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
Content-Length: 291

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_e1b0639b-125e-47cb-96ee-a586bfdce693/close","correlationId":"qa-e2a8878b-fa61-43cc-b835-09ea97348e8d"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-da23253f-1794-488e-b6b6-96a077e93883

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da23253f-1794-488e-b6b6-96a077e93883
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-da23253f-1794-488e-b6b6-96a077e93883
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-51a66aba-56db-4001-b122-99f15db0c977

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51a66aba-56db-4001-b122-99f15db0c977
Content-Type: application/json

--- request body ---
{"handle":"qa-4e235fa057bf","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-51a66aba-56db-4001-b122-99f15db0c977
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 427
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-51a66aba-56db-4001-b122-99f15db0c977"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-591855b0-c0b3-4b4b-9d6f-11fe3d3e697a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-591855b0-c0b3-4b4b-9d6f-11fe3d3e697a
Content-Type: application/json

--- request body ---
{"handle":"qa-9397dfb4f216","password":"****"}

--- response: 200 in 35 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-591855b0-c0b3-4b4b-9d6f-11fe3d3e697a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 421
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_62f27314-28f3-42d6-93b8-667c7baff931"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-decb5783-dd26-49ed-8982-1f9098920b80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-decb5783-dd26-49ed-8982-1f9098920b80
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-decb5783-dd26-49ed-8982-1f9098920b80
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-455a6199-d92f-4dad-b745-125e2b01512d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-455a6199-d92f-4dad-b745-125e2b01512d
Content-Type: application/json

--- request body ---
{"handle":"qa-9397dfb4f216","password":"****"}

--- response: 401 in 17 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-455a6199-d92f-4dad-b745-125e2b01512d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 410
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-455a6199-d92f-4dad-b745-125e2b01512d"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b4539100-d256-4c41-a637-f39a49762fbf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4539100-d256-4c41-a637-f39a49762fbf
Content-Type: application/json

--- response: 204 in 35 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b4539100-d256-4c41-a637-f39a49762fbf
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-ed42f542-4939-4b53-a907-2d0663bd026d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed42f542-4939-4b53-a907-2d0663bd026d
Content-Type: application/json

--- request body ---
{"handle":"qa-2171209d29b2","password":"****"}

--- response: 401 in 35 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ed42f542-4939-4b53-a907-2d0663bd026d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 396
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ed42f542-4939-4b53-a907-2d0663bd026d"}
```
