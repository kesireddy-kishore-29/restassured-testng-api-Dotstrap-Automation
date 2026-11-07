# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[2]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 512 | `qa-63c914ff-3c28-4b34-887a-463438975359` |
| 2 | `POST /v1/accounts` | 201 | 76 | `qa-b445dbde-f66c-4c29-88e6-e912c76fbd44` |
| 3 | `POST /v1/accounts` | 201 | 49 | `qa-f9f8c3b9-cb80-4e07-8232-ad1fbd38ffd7` |
| 4 | `POST /v1/auth/token` | 200 | 48 | `qa-c2f3354b-bd52-4a01-911b-e9b856ddd1d0` |
| 5 | `POST /v1/conversations` | 201 | 50 | `qa-42463e90-8850-4968-84fd-1827f753ef04` |
| 6 | `POST /v1/auth/token` | 200 | 60 | `qa-4363794d-d12a-4113-9c6a-4f79aa4df227` |
| 7 | `POST /v1/conversations/{id}/messages` | 403 | 29 | `qa-05ab498f-7090-4fd9-bebe-2f005392e19d` |
| 8 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-d20aae70-1e75-4789-9a83-bede5f03a7df` |
| 9 | `POST /v1/auth/token` | 401 | 27 | `qa-75b7b953-817d-4224-a71c-4d4e9d6edae6` |
| 10 | `POST /v1/auth/token` | 200 | 73 | `qa-e2abda78-2273-4bae-967c-bc85d8c987b8` |
| 11 | `DELETE /v1/accounts/me` | 204 | 48 | `qa-b2ff8ba7-f7d6-45cc-8f65-15ddd7edd8d3` |
| 12 | `POST /v1/auth/token` | 401 | 38 | `qa-a1283258-e1aa-4345-b3e1-448ba051483f` |
| 13 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-5f95cf82-d55a-44f2-8a15-53321ff78f02` |
| 14 | `POST /v1/auth/token` | 401 | 22 | `qa-64443145-4727-4cb7-a80e-277c70e9a439` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-63c914ff-3c28-4b34-887a-463438975359

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63c914ff-3c28-4b34-887a-463438975359
Content-Type: application/json

--- request body ---
{"handle":"qa-900ed7cda102","displayName":"QA 900ed7cda102","password":"****","region":"eu"}

--- response: 201 in 512 ms ---
Date: Fri, 30 Oct 2026 08:46:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-63c914ff-3c28-4b34-887a-463438975359
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Location: /v1/accounts/qa-900ed7cda102
X-Served-Region: eu
Content-Length: 181

{"id":"acc_786f8e2e-7705-4c23-9663-b416f8f5d511","handle":"qa-900ed7cda102","displayName":"QA 900ed7cda102","region":"eu","role":"user","createdAt":"2026-10-30T08:46:01.376705627Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b445dbde-f66c-4c29-88e6-e912c76fbd44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b445dbde-f66c-4c29-88e6-e912c76fbd44
Content-Type: application/json

--- request body ---
{"handle":"qa-8bf103f4a866","displayName":"QA 8bf103f4a866","password":"****","region":"eu"}

--- response: 201 in 76 ms ---
Date: Fri, 30 Oct 2026 08:46:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-b445dbde-f66c-4c29-88e6-e912c76fbd44
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 10
Location: /v1/accounts/qa-8bf103f4a866
X-Served-Region: eu
Content-Length: 181

{"id":"acc_37965293-1e7b-4df1-be53-98ea5fb0ff4d","handle":"qa-8bf103f4a866","displayName":"QA 8bf103f4a866","region":"eu","role":"user","createdAt":"2026-10-30T08:46:01.873319923Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-f9f8c3b9-cb80-4e07-8232-ad1fbd38ffd7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9f8c3b9-cb80-4e07-8232-ad1fbd38ffd7
Content-Type: application/json

--- request body ---
{"handle":"qa-b7ab8505aefc","displayName":"QA b7ab8505aefc","password":"****","region":"eu"}

--- response: 201 in 49 ms ---
Date: Fri, 30 Oct 2026 08:46:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9f8c3b9-cb80-4e07-8232-ad1fbd38ffd7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 10
Location: /v1/accounts/qa-b7ab8505aefc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e63ac591-bd5b-45e8-ad0a-84c1ab606671","handle":"qa-b7ab8505aefc","displayName":"QA b7ab8505aefc","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.001803261Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-c2f3354b-bd52-4a01-911b-e9b856ddd1d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2f3354b-bd52-4a01-911b-e9b856ddd1d0
Content-Type: application/json

--- request body ---
{"handle":"qa-900ed7cda102","password":"****"}

--- response: 200 in 48 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-c2f3354b-bd52-4a01-911b-e9b856ddd1d0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_786f8e2e-7705-4c23-9663-b416f8f5d511"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-42463e90-8850-4968-84fd-1827f753ef04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42463e90-8850-4968-84fd-1827f753ef04
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8bf103f4a866","subject":"Error contract","message":"Hi"}

--- response: 201 in 50 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-42463e90-8850-4968-84fd-1827f753ef04
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
Location: /v1/conversations/cnv_de62ceec-9f10-4c54-b8b1-7883a3abd82e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_de62ceec-9f10-4c54-b8b1-7883a3abd82e","subject":"Error contract","status":"open","region":"eu","participants":["qa-900ed7cda102","qa-8bf103f4a866"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:02.199734251Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-4363794d-d12a-4113-9c6a-4f79aa4df227

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4363794d-d12a-4113-9c6a-4f79aa4df227
Content-Type: application/json

--- request body ---
{"handle":"qa-b7ab8505aefc","password":"****"}

--- response: 200 in 60 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-4363794d-d12a-4113-9c6a-4f79aa4df227
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 549
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e63ac591-bd5b-45e8-ad0a-84c1ab606671"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_de62ceec-9f10-4c54-b8b1-7883a3abd82e/messages
correlation: qa-05ab498f-7090-4fd9-bebe-2f005392e19d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05ab498f-7090-4fd9-bebe-2f005392e19d
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 403 in 29 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-05ab498f-7090-4fd9-bebe-2f005392e19d
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_de62ceec-9f10-4c54-b8b1-7883a3abd82e/messages","correlationId":"qa-05ab498f-7090-4fd9-bebe-2f005392e19d"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d20aae70-1e75-4789-9a83-bede5f03a7df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d20aae70-1e75-4789-9a83-bede5f03a7df
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d20aae70-1e75-4789-9a83-bede5f03a7df
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
correlation: qa-75b7b953-817d-4224-a71c-4d4e9d6edae6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75b7b953-817d-4224-a71c-4d4e9d6edae6
Content-Type: application/json

--- request body ---
{"handle":"qa-b7ab8505aefc","password":"****"}

--- response: 401 in 27 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-75b7b953-817d-4224-a71c-4d4e9d6edae6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 539
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-75b7b953-817d-4224-a71c-4d4e9d6edae6"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-e2abda78-2273-4bae-967c-bc85d8c987b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2abda78-2273-4bae-967c-bc85d8c987b8
Content-Type: application/json

--- request body ---
{"handle":"qa-8bf103f4a866","password":"****"}

--- response: 200 in 73 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2abda78-2273-4bae-967c-bc85d8c987b8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 534
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_37965293-1e7b-4df1-be53-98ea5fb0ff4d"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b2ff8ba7-f7d6-45cc-8f65-15ddd7edd8d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2ff8ba7-f7d6-45cc-8f65-15ddd7edd8d3
Content-Type: application/json

--- response: 204 in 48 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b2ff8ba7-f7d6-45cc-8f65-15ddd7edd8d3
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
correlation: qa-a1283258-e1aa-4345-b3e1-448ba051483f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1283258-e1aa-4345-b3e1-448ba051483f
Content-Type: application/json

--- request body ---
{"handle":"qa-8bf103f4a866","password":"****"}

--- response: 401 in 38 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a1283258-e1aa-4345-b3e1-448ba051483f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 519
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a1283258-e1aa-4345-b3e1-448ba051483f"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5f95cf82-d55a-44f2-8a15-53321ff78f02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f95cf82-d55a-44f2-8a15-53321ff78f02
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5f95cf82-d55a-44f2-8a15-53321ff78f02
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-64443145-4727-4cb7-a80e-277c70e9a439

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64443145-4727-4cb7-a80e-277c70e9a439
Content-Type: application/json

--- request body ---
{"handle":"qa-900ed7cda102","password":"****"}

--- response: 401 in 22 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-64443145-4727-4cb7-a80e-277c70e9a439
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 510
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-64443145-4727-4cb7-a80e-277c70e9a439"}
```
