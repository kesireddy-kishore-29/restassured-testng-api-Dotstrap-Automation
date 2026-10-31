# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/credits/purchases]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[15]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-6cafc45c-56cb-42a2-b907-989949ab77ce` |
| 2 | `POST /v1/accounts` | 201 | 20 | `qa-8aa8ab56-01ae-41e0-9904-bbdcd6ae9198` |
| 3 | `POST /v1/auth/token` | 200 | 19 | `qa-761148af-6b87-40dd-a98c-b6e73ed015a9` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-4cc79e40-bb54-459f-a894-322704009c00` |
| 5 | `POST /v1/credits/purchases` | 503 | 22 | `qa-77333736-32d3-4104-8bc5-9e6752d845fb` |
| 6 | `POST /v1/auth/token` | 200 | 52 | `qa-d5ab2d4a-d788-493f-aa78-cb59b2aebc6f` |
| 7 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-572fbc19-d8af-43c8-bbb9-06e2db66a69a` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-e0e7e507-d6d0-41fb-af73-1ca3ae3e2c6f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-d12095f2-1239-43f8-b92f-a8ef2a16efb3` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-eab3bd96-03a3-4eec-b321-44a03549ec85` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6cafc45c-56cb-42a2-b907-989949ab77ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6cafc45c-56cb-42a2-b907-989949ab77ce
Content-Type: application/json

--- request body ---
{"handle":"qa-0393f933a91f","displayName":"QA 0393f933a91f","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-6cafc45c-56cb-42a2-b907-989949ab77ce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 356
RateLimit-Reset: 7
Location: /v1/accounts/qa-0393f933a91f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_99b62d62-0457-45f7-97ce-f91cd97e4766","handle":"qa-0393f933a91f","displayName":"QA 0393f933a91f","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.684297904Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8aa8ab56-01ae-41e0-9904-bbdcd6ae9198

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8aa8ab56-01ae-41e0-9904-bbdcd6ae9198
Content-Type: application/json

--- request body ---
{"handle":"qa-1874805f1590","displayName":"QA 1874805f1590","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-8aa8ab56-01ae-41e0-9904-bbdcd6ae9198
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 352
RateLimit-Reset: 7
Location: /v1/accounts/qa-1874805f1590
X-Served-Region: eu
Content-Length: 181

{"id":"acc_73d037f1-0fbc-49aa-bcf1-c60194b8e51d","handle":"qa-1874805f1590","displayName":"QA 1874805f1590","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.727856449Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-761148af-6b87-40dd-a98c-b6e73ed015a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-761148af-6b87-40dd-a98c-b6e73ed015a9
Content-Type: application/json

--- request body ---
{"handle":"qa-0393f933a91f","password":"****"}

--- response: 200 in 19 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-761148af-6b87-40dd-a98c-b6e73ed015a9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 347
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_99b62d62-0457-45f7-97ce-f91cd97e4766"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4cc79e40-bb54-459f-a894-322704009c00

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cc79e40-bb54-459f-a894-322704009c00
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1874805f1590","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-4cc79e40-bb54-459f-a894-322704009c00
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
Location: /v1/conversations/cnv_0d524949-3f66-4c63-91e0-5443e3cc20cb
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0d524949-3f66-4c63-91e0-5443e3cc20cb","subject":"Error contract","status":"open","region":"eu","participants":["qa-0393f933a91f","qa-1874805f1590"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:26.774219092Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-77333736-32d3-4104-8bc5-9e6752d845fb

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e08bb38de6d248968fb96852e71a41e3
X-Fault-Key: 7f307e44-b7d9-4c14-afb6-fcca6e201ce0
X-Fault: unavailable-once
X-Correlation-Id: qa-77333736-32d3-4104-8bc5-9e6752d845fb
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 22 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-77333736-32d3-4104-8bc5-9e6752d845fb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 265

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/purchases","correlationId":"qa-77333736-32d3-4104-8bc5-9e6752d845fb"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d5ab2d4a-d788-493f-aa78-cb59b2aebc6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5ab2d4a-d788-493f-aa78-cb59b2aebc6f
Content-Type: application/json

--- request body ---
{"handle":"qa-1874805f1590","password":"****"}

--- response: 200 in 52 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5ab2d4a-d788-493f-aa78-cb59b2aebc6f
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_73d037f1-0fbc-49aa-bcf1-c60194b8e51d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-572fbc19-d8af-43c8-bbb9-06e2db66a69a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-572fbc19-d8af-43c8-bbb9-06e2db66a69a
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-572fbc19-d8af-43c8-bbb9-06e2db66a69a
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
correlation: qa-e0e7e507-d6d0-41fb-af73-1ca3ae3e2c6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0e7e507-d6d0-41fb-af73-1ca3ae3e2c6f
Content-Type: application/json

--- request body ---
{"handle":"qa-1874805f1590","password":"****"}

--- response: 401 in 18 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e0e7e507-d6d0-41fb-af73-1ca3ae3e2c6f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 324
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e0e7e507-d6d0-41fb-af73-1ca3ae3e2c6f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d12095f2-1239-43f8-b92f-a8ef2a16efb3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d12095f2-1239-43f8-b92f-a8ef2a16efb3
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d12095f2-1239-43f8-b92f-a8ef2a16efb3
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
correlation: qa-eab3bd96-03a3-4eec-b321-44a03549ec85

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eab3bd96-03a3-4eec-b321-44a03549ec85
Content-Type: application/json

--- request body ---
{"handle":"qa-0393f933a91f","password":"****"}

--- response: 401 in 16 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eab3bd96-03a3-4eec-b321-44a03549ec85
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 320
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-eab3bd96-03a3-4eec-b321-44a03549ec85"}
```
