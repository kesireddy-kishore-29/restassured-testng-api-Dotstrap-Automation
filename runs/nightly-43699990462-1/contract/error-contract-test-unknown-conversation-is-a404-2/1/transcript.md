# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 9 | `qa-a841e4fc-10a8-45af-93bc-d8cd65f064aa` |
| 2 | `POST /v1/auth/token` | 200 | 20 | `qa-1a552466-9ff8-4046-8715-8dbf7f07af51` |
| 3 | `POST /v1/conversations/{id}/messages` | 404 | 23 | `qa-c2fed6dd-3801-4777-a581-80f22cf7225b` |
| 4 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-0eaaa9f5-e646-4e4c-9a5e-4d76c0f7b5fe` |
| 5 | `POST /v1/auth/token` | 401 | 9 | `qa-745a9a8f-bb2e-42ae-9fe3-8ed34e52c0d1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a841e4fc-10a8-45af-93bc-d8cd65f064aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a841e4fc-10a8-45af-93bc-d8cd65f064aa
Content-Type: application/json

--- request body ---
{"handle":"qa-faf95338f566","displayName":"QA faf95338f566","password":"****","region":"eu"}

--- response: 201 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-a841e4fc-10a8-45af-93bc-d8cd65f064aa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 290
RateLimit-Reset: 7
Location: /v1/accounts/qa-faf95338f566
X-Served-Region: eu
Content-Length: 181

{"id":"acc_736b1492-bbc4-4550-a54e-1b2b56356d85","handle":"qa-faf95338f566","displayName":"QA faf95338f566","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.843681817Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-1a552466-9ff8-4046-8715-8dbf7f07af51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a552466-9ff8-4046-8715-8dbf7f07af51
Content-Type: application/json

--- request body ---
{"handle":"qa-faf95338f566","password":"****"}

--- response: 200 in 20 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-1a552466-9ff8-4046-8715-8dbf7f07af51
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 289
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_736b1492-bbc4-4550-a54e-1b2b56356d85"}
```

## 3. POST /v1/conversations/{id}/messages

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-c2fed6dd-3801-4777-a581-80f22cf7225b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2fed6dd-3801-4777-a581-80f22cf7225b
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 404 in 23 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c2fed6dd-3801-4777-a581-80f22cf7225b
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
Content-Length: 262

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-c2fed6dd-3801-4777-a581-80f22cf7225b"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0eaaa9f5-e646-4e4c-9a5e-4d76c0f7b5fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0eaaa9f5-e646-4e4c-9a5e-4d76c0f7b5fe
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0eaaa9f5-e646-4e4c-9a5e-4d76c0f7b5fe
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

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-745a9a8f-bb2e-42ae-9fe3-8ed34e52c0d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-745a9a8f-bb2e-42ae-9fe3-8ed34e52c0d1
Content-Type: application/json

--- request body ---
{"handle":"qa-faf95338f566","password":"****"}

--- response: 401 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-745a9a8f-bb2e-42ae-9fe3-8ed34e52c0d1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 280
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-745a9a8f-bb2e-42ae-9fe3-8ed34e52c0d1"}
```
