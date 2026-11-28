# Transcript: Grants, purchases and spends sum to the balance

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.LedgerConsistencyTest#historySumsToTheBalance` |
| Features | FEAT-LEDGER-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 13 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 48 | `qa-38d3a508-a8bb-4bd7-bfa9-0ebc0a7ea612` |
| 2 | `POST /v1/accounts` | 201 | 40 | `qa-dd5aa1b8-a237-4a85-ba66-c6d145bef3ad` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-0de4782d-1a21-434d-b6f7-341b2852b91a` |
| 4 | `POST /v1/credits/purchases` | 201 | 10 | `qa-d6b42200-ea7e-4618-b917-334b96ce214c` |
| 5 | `POST /v1/credits/purchases` | 201 | 28 | `qa-fc4c24f9-ff13-4cc6-9ae3-8d23c60476b0` |
| 6 | `POST /v1/conversations` | 201 | 19 | `qa-4b908ff7-4bc8-4e2c-8e7e-cfa5cb67d841` |
| 7 | `GET /v1/credits/ledger` | 200 | 12 | `qa-9199dcdd-b173-4441-9368-ec7c19700749` |
| 8 | `GET /v1/credits/balance` | 200 | 21 | `qa-8a47792f-8fc8-4ddd-ae3f-db4678b55c68` |
| 9 | `POST /v1/auth/token` | 200 | 29 | `qa-8a3fb7d8-b786-444d-870e-cbe6788425b9` |
| 10 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-7e0b727b-fb60-4eea-aae1-4430de6574ea` |
| 11 | `POST /v1/auth/token` | 401 | 19 | `qa-8fed8063-69f1-4251-af54-afc70ec3714c` |
| 12 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-d584b861-1bcd-4773-8f9c-c01e274c1009` |
| 13 | `POST /v1/auth/token` | 401 | 8 | `qa-58585c4f-0129-4da3-a321-eea0ee2a71eb` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-38d3a508-a8bb-4bd7-bfa9-0ebc0a7ea612

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38d3a508-a8bb-4bd7-bfa9-0ebc0a7ea612
Content-Type: application/json

--- request body ---
{"handle":"qa-1a79d84d9708","displayName":"QA 1a79d84d9708","password":"****","region":"eu"}

--- response: 201 in 48 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-38d3a508-a8bb-4bd7-bfa9-0ebc0a7ea612
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 9
Location: /v1/accounts/qa-1a79d84d9708
X-Served-Region: eu
Content-Length: 181

{"id":"acc_30434f5b-1f05-4b55-ac36-b09dae87ed16","handle":"qa-1a79d84d9708","displayName":"QA 1a79d84d9708","region":"eu","role":"user","createdAt":"2026-11-24T12:38:10.304419290Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-dd5aa1b8-a237-4a85-ba66-c6d145bef3ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd5aa1b8-a237-4a85-ba66-c6d145bef3ad
Content-Type: application/json

--- request body ---
{"handle":"qa-6dd767f2dd75","displayName":"QA 6dd767f2dd75","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-dd5aa1b8-a237-4a85-ba66-c6d145bef3ad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 9
Location: /v1/accounts/qa-6dd767f2dd75
X-Served-Region: eu
Content-Length: 181

{"id":"acc_be490e40-e92b-4d5f-a090-7a51fe193787","handle":"qa-6dd767f2dd75","displayName":"QA 6dd767f2dd75","region":"eu","role":"user","createdAt":"2026-11-24T12:38:10.413236259Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0de4782d-1a21-434d-b6f7-341b2852b91a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0de4782d-1a21-434d-b6f7-341b2852b91a
Content-Type: application/json

--- request body ---
{"handle":"qa-1a79d84d9708","password":"****"}

--- response: 200 in 20 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-0de4782d-1a21-434d-b6f7-341b2852b91a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_30434f5b-1f05-4b55-ac36-b09dae87ed16"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-d6b42200-ea7e-4618-b917-334b96ce214c

--- request headers ---
Accept: application/json
Idempotency-Key: qa-d8e6fb2884954d68ac657f74509c9ec8
X-Correlation-Id: qa-d6b42200-ea7e-4618-b917-334b96ce214c
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-d6b42200-ea7e-4618-b917-334b96ce214c
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
Location: /v1/credits/purchases/pur_cc11b423-ee16-42f6-ab98-081270b420ca
Content-Length: 144

{"id":"pur_cc11b423-ee16-42f6-ab98-081270b420ca","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-24T12:38:10.473635657Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-fc4c24f9-ff13-4cc6-9ae3-8d23c60476b0

--- request headers ---
Accept: application/json
Idempotency-Key: qa-416e864dda6d4096845e824cdecbc623
X-Correlation-Id: qa-fc4c24f9-ff13-4cc6-9ae3-8d23c60476b0
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 28 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc4c24f9-ff13-4cc6-9ae3-8d23c60476b0
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
Location: /v1/credits/purchases/pur_37623078-11aa-46ae-96a4-30a0bc5e5e20
Content-Length: 144

{"id":"pur_37623078-11aa-46ae-96a4-30a0bc5e5e20","packId":"pack-50","credits":50,"balanceAfter":65,"createdAt":"2026-11-24T12:38:10.523992704Z"}
```

## 6. POST /v1/conversations

```text
#6 POST http://localhost:7070/v1/conversations
correlation: qa-4b908ff7-4bc8-4e2c-8e7e-cfa5cb67d841

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b908ff7-4bc8-4e2c-8e7e-cfa5cb67d841
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6dd767f2dd75","subject":"Paid message","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b908ff7-4bc8-4e2c-8e7e-cfa5cb67d841
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
Location: /v1/conversations/cnv_0efec93c-6384-49c3-aaa1-493d05756ec3
X-Data-Region: eu
Content-Length: 235

{"id":"cnv_0efec93c-6384-49c3-aaa1-493d05756ec3","subject":"Paid message","status":"open","region":"eu","participants":["qa-1a79d84d9708","qa-6dd767f2dd75"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:10.566192546Z"}
```

## 7. GET /v1/credits/ledger

```text
#7 GET http://localhost:7070/v1/credits/ledger
correlation: qa-9199dcdd-b173-4441-9368-ec7c19700749

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9199dcdd-b173-4441-9368-ec7c19700749
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-9199dcdd-b173-4441-9368-ec7c19700749
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 791

{"items":[{"id":"led_8a42afa6-5ace-4f60-b9a4-3388d60fd6d6","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-24T12:38:10.304432264Z"},{"id":"led_941b91c1-b82f-478c-a7fa-c16ca0545294","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_cc11b423-ee16-42f6-ab98-081270b420ca","createdAt":"2026-11-24T12:38:10.473635657Z"},{"id":"led_6881cdfc-a209-4303-ad72-57df98273764","type":"purchase","amount":50,"balanceAfter":65,"reference":"pur_37623078-11aa-46ae-96a4-30a0bc5e5e20","createdAt":"2026-11-24T12:38:10.523992704Z"},{"id":"led_1e37f3a1-27af-4cb7-9014-a1df62322867","type":"spend","amount":-1,"balanceAfter":64,"reference":"cnv_0efec93c-6384-49c3-aaa1-493d05756ec3","createdAt":"2026-11-24T12:38:10.566178760Z"}],"total":4,"balance":64}
```

## 8. GET /v1/credits/balance

```text
#8 GET http://localhost:7070/v1/credits/balance
correlation: qa-8a47792f-8fc8-4ddd-ae3f-db4678b55c68

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a47792f-8fc8-4ddd-ae3f-db4678b55c68
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a47792f-8fc8-4ddd-ae3f-db4678b55c68
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 90

{"balance":64,"currency":"credits","accountId":"acc_30434f5b-1f05-4b55-ac36-b09dae87ed16"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-8a3fb7d8-b786-444d-870e-cbe6788425b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a3fb7d8-b786-444d-870e-cbe6788425b9
Content-Type: application/json

--- request body ---
{"handle":"qa-6dd767f2dd75","password":"****"}

--- response: 200 in 29 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a3fb7d8-b786-444d-870e-cbe6788425b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_be490e40-e92b-4d5f-a090-7a51fe193787"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7e0b727b-fb60-4eea-aae1-4430de6574ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e0b727b-fb60-4eea-aae1-4430de6574ea
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7e0b727b-fb60-4eea-aae1-4430de6574ea
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

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-8fed8063-69f1-4251-af54-afc70ec3714c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8fed8063-69f1-4251-af54-afc70ec3714c
Content-Type: application/json

--- request body ---
{"handle":"qa-6dd767f2dd75","password":"****"}

--- response: 401 in 19 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8fed8063-69f1-4251-af54-afc70ec3714c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8fed8063-69f1-4251-af54-afc70ec3714c"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d584b861-1bcd-4773-8f9c-c01e274c1009

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d584b861-1bcd-4773-8f9c-c01e274c1009
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d584b861-1bcd-4773-8f9c-c01e274c1009
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
```

## 13. POST /v1/auth/token

```text
#13 POST http://localhost:7070/v1/auth/token
correlation: qa-58585c4f-0129-4da3-a321-eea0ee2a71eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58585c4f-0129-4da3-a321-eea0ee2a71eb
Content-Type: application/json

--- request body ---
{"handle":"qa-1a79d84d9708","password":"****"}

--- response: 401 in 8 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-58585c4f-0129-4da3-a321-eea0ee2a71eb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-58585c4f-0129-4da3-a321-eea0ee2a71eb"}
```
