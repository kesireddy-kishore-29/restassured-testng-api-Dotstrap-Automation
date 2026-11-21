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
| 1 | `POST /v1/accounts` | 201 | 47 | `qa-8a717857-d5ea-4073-bc13-53ca8319236b` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-ba59ee6d-2582-4ee4-9c3a-cbabca0de88a` |
| 3 | `POST /v1/auth/token` | 200 | 60 | `qa-a832a2eb-dd9c-4e20-8fce-e17e5d5c48c9` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-c04fde76-d316-46d2-8173-70393187b04a` |
| 5 | `GET /v1/credits/ledger` | 503 | 32 | `qa-d44dcc9b-a3fa-453e-9101-ef71e52eb1d3` |
| 6 | `POST /v1/auth/token` | 200 | 44 | `qa-767507ac-2933-43f0-a976-e93db4b4ff80` |
| 7 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-b56cabd8-87ca-49cd-a37e-d9bafdc54381` |
| 8 | `POST /v1/auth/token` | 401 | 22 | `qa-545195c3-a3ec-445f-bfb4-2a19b260cbb3` |
| 9 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-26a29e75-6c42-4c49-909f-2e47c537d084` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-323113cf-99f6-48b8-b668-865fd8b973ee` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8a717857-d5ea-4073-bc13-53ca8319236b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a717857-d5ea-4073-bc13-53ca8319236b
Content-Type: application/json

--- request body ---
{"handle":"qa-8e860196f79a","displayName":"QA 8e860196f79a","password":"****","region":"eu"}

--- response: 201 in 47 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a717857-d5ea-4073-bc13-53ca8319236b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 370
RateLimit-Reset: 7
Location: /v1/accounts/qa-8e860196f79a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7aec1ec0-b537-4e75-913e-6ee8238d8c8f","handle":"qa-8e860196f79a","displayName":"QA 8e860196f79a","region":"eu","role":"user","createdAt":"2026-11-20T10:10:03.240713748Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ba59ee6d-2582-4ee4-9c3a-cbabca0de88a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba59ee6d-2582-4ee4-9c3a-cbabca0de88a
Content-Type: application/json

--- request body ---
{"handle":"qa-01d37b9e6828","displayName":"QA 01d37b9e6828","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba59ee6d-2582-4ee4-9c3a-cbabca0de88a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 362
RateLimit-Reset: 6
Location: /v1/accounts/qa-01d37b9e6828
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b3e3c8ba-0e35-404b-a71c-21d411f54c63","handle":"qa-01d37b9e6828","displayName":"QA 01d37b9e6828","region":"eu","role":"user","createdAt":"2026-11-20T10:10:03.300274624Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a832a2eb-dd9c-4e20-8fce-e17e5d5c48c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a832a2eb-dd9c-4e20-8fce-e17e5d5c48c9
Content-Type: application/json

--- request body ---
{"handle":"qa-8e860196f79a","password":"****"}

--- response: 200 in 60 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-a832a2eb-dd9c-4e20-8fce-e17e5d5c48c9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 356
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7aec1ec0-b537-4e75-913e-6ee8238d8c8f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c04fde76-d316-46d2-8173-70393187b04a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c04fde76-d316-46d2-8173-70393187b04a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-01d37b9e6828","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-c04fde76-d316-46d2-8173-70393187b04a
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
Location: /v1/conversations/cnv_956d401a-b652-4c67-b855-14f1eee4b818
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_956d401a-b652-4c67-b855-14f1eee4b818","subject":"Error contract","status":"open","region":"eu","participants":["qa-8e860196f79a","qa-01d37b9e6828"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:03.406848200Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-d44dcc9b-a3fa-453e-9101-ef71e52eb1d3

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: cc2bbd5d-339c-40a6-a6c6-4e762ffc83f5
X-Correlation-Id: qa-d44dcc9b-a3fa-453e-9101-ef71e52eb1d3
Content-Type: application/json

--- response: 503 in 32 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d44dcc9b-a3fa-453e-9101-ef71e52eb1d3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 262

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/ledger","correlationId":"qa-d44dcc9b-a3fa-453e-9101-ef71e52eb1d3"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-767507ac-2933-43f0-a976-e93db4b4ff80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-767507ac-2933-43f0-a976-e93db4b4ff80
Content-Type: application/json

--- request body ---
{"handle":"qa-01d37b9e6828","password":"****"}

--- response: 200 in 44 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-767507ac-2933-43f0-a976-e93db4b4ff80
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b3e3c8ba-0e35-404b-a71c-21d411f54c63"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b56cabd8-87ca-49cd-a37e-d9bafdc54381

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b56cabd8-87ca-49cd-a37e-d9bafdc54381
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b56cabd8-87ca-49cd-a37e-d9bafdc54381
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
correlation: qa-545195c3-a3ec-445f-bfb4-2a19b260cbb3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-545195c3-a3ec-445f-bfb4-2a19b260cbb3
Content-Type: application/json

--- request body ---
{"handle":"qa-01d37b9e6828","password":"****"}

--- response: 401 in 22 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-545195c3-a3ec-445f-bfb4-2a19b260cbb3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 329
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-545195c3-a3ec-445f-bfb4-2a19b260cbb3"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-26a29e75-6c42-4c49-909f-2e47c537d084

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26a29e75-6c42-4c49-909f-2e47c537d084
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-26a29e75-6c42-4c49-909f-2e47c537d084
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
correlation: qa-323113cf-99f6-48b8-b668-865fd8b973ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-323113cf-99f6-48b8-b668-865fd8b973ee
Content-Type: application/json

--- request body ---
{"handle":"qa-8e860196f79a","password":"****"}

--- response: 401 in 10 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-323113cf-99f6-48b8-b668-865fd8b973ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 325
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-323113cf-99f6-48b8-b668-865fd8b973ee"}
```
